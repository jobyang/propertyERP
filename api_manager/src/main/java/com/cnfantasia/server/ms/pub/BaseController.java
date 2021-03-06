/**   
* Filename:    BaseController.java   
* @version:    1.0  
* Create at:   2014年5月9日 上午4:01:57   
* Description:  
*   
* Modification History:   
* Date        Author      Version     Description   
* ----------------------------------------------------------------- 
* 2014年5月9日    shiyl      1.0         1.0 Version   
*/
package com.cnfantasia.server.ms.pub;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.cnfantasia.server.business.pub.CommBaseController;
import com.cnfantasia.server.business.pub.exception.ExceptionParseUtil;
import com.cnfantasia.server.common.CommConstants;
import com.cnfantasia.server.common.exception.BusinessRuntimeException;
import com.cnfantasia.server.common.exception.FocException;
import com.cnfantasia.server.common.exception.FocRuntimeException;
import com.cnfantasia.server.common.exception.TimeOutRuntimeException;
import com.cnfantasia.server.common.exception.ValidateRuntimeException;
import com.cnfantasia.server.common.json.JsonResponse;
import com.cnfantasia.server.common.messageSource.MessageSourceUtil;
import com.cnfantasia.server.ms.logger.SysLoggerManagerInterceptor;

/**
 * Filename:    BaseController.java
 * @version:    1.0.0
 * Create at:   2014年5月9日 上午4:01:57
 * Description:
 *
 * Modification History:
 * Date           Author           Version           Description
 * ------------------------------------------------------------------
 * 2014年5月9日       shiyl             1.0             1.0 Version
 */
public class BaseController extends CommBaseController<Object>{
	private Log logger = LogFactory.getLog(getClass());
	public static final String REQUEST_KEY_RESPONSE_DATA=CommBaseController.class.getName()+"_response";
	/**
	* 异常控制，这便是异常细节可控，将来可用于支持国际化（异常信息国际化）
	* */
	@ExceptionHandler(Exception.class)
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseStatus(value=HttpStatus.OK)//2014-5-15 8:32:41 update
//	@ResponseBody
  public ModelAndView handleException(Exception ex, HttpServletRequest request) {
		logger.error("BaseController.handleException.info", ex);
		ex.printStackTrace();
		JsonResponse jsonResponse = new JsonResponse();
		//1.搜集参数
		String status = null;
		String errCode = null;
		String errMessage = null;
		if(TimeOutRuntimeException.class.equals(ex.getClass())){//系统超时
			status = CommConstants.ResponseStatus.LOGIN_TIME_OUT;
		}else if(BusinessRuntimeException.class.equals(ex.getClass())){//业务处理异常
			status = CommConstants.ResponseStatus.BUSINESS_FAILED;
		}else if(ValidateRuntimeException.class.equals(ex.getClass())){//校验异常
			status = CommConstants.ResponseStatus.VALIDATE_ERR;
		}else{//默认系统异常
			status = CommConstants.ResponseStatus.SYSTEM_ERR;
		}
		if (ex instanceof FocRuntimeException) {
			errCode = ((FocRuntimeException) ex).getErrCode();
			errMessage = MessageSourceUtil.getMessage(errCode,((FocRuntimeException) ex).getParamArrayOfObject());
		} else if (ex instanceof FocException) {
			errCode= ((FocException) ex).getErrCode();
			errMessage = MessageSourceUtil.getMessage(errCode,((FocException) ex).getParamArrayOfObject());
		}else{
			errCode = CommConstants.DEFAULT_SYS_ERRCODE;
			errMessage = ex.getMessage();
		}
		logger.error("errCode is: " + errCode+",errMessage is: " + errMessage);
		//2.交互
		jsonResponse.setStatus(status);
		jsonResponse.setMessage(errMessage);//写在前
//		jsonResponse.setMessageKey(errCode);
		jsonResponse.setErrcode(errCode);
		{//调试信息
			String uniqueCode = getUniqueCode(ex, request);
			jsonResponse.setTransNo(uniqueCode);
		}
		//3.结果处理
//		return JSON.toJSONString(jsonResponse);
		request.setAttribute("jsonResponse", jsonResponse);
		request.setAttribute("stack", ExceptionParseUtil.parseExceptionMessage(ex));
		ModelAndView mav = new ModelAndView();
		//mav.setViewName("/error/error");
		if(status.equals(CommConstants.ResponseStatus.LOGIN_TIME_OUT)){
			mav.setViewName("/security/index");
		}else{
			mav.setViewName("/error/404");
		}
		// 3.结果处理
		String responseData = JSON.toJSONString(jsonResponse);
		request.setAttribute(REQUEST_KEY_RESPONSE_DATA, responseData);//存入request中
		return mav;
	}
	
	@Override
	public String getUniqueCode(Exception ex, HttpServletRequest request) {
		String uniqueCode = (String)request.getAttribute(SysLoggerManagerInterceptor.REQUEST_KEY_UQEXPKEY);
		return uniqueCode;
	}
	
	/**
	 * 转request中参数转换为Map
	 * @param request
	 * @return
	 */
	public Map<String, Object> getParameterMap(HttpServletRequest request) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Enumeration<?> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String paramName = (String) enumeration.nextElement();

			String[] values = request.getParameterValues(paramName);
			if (values.length == 1) {
				map.put(paramName, values[0]);
			} else {
				map.put(paramName, values);
			}
		}
		return map;
	}
}
