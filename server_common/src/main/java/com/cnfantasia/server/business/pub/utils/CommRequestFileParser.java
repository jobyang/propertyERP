/**   
 * Filename:    CommRequestFileParser.java   
 * @version:    1.0  
 * Create at:   2014年7月29日 上午8:59:21   
 * Description:  
 *   
 * Modification History:   
 * Date        Author      Version     Description   
 * ----------------------------------------------------------------- 
 * 2014年7月29日    shiyl      1.0         1.0 Version   
 */
package com.cnfantasia.server.business.pub.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.cnfantasia.server.business.pub.entity.RequestFileEntity;
import com.cnfantasia.server.common.exception.BusinessRuntimeException;

/**
 * Filename: CommRequestFileParser.java
 * 
 * @version: 1.0.0 Create at: 2014年7月29日 上午8:59:21 Description:
 * 
 *           Modification History: Date Author Version Description
 *           ------------------------------------------------------------------
 *           2014年7月29日 shiyl 1.0 1.0 Version
 */
public class CommRequestFileParser {
	private static Log logger = LogFactory.getLog(CommRequestFileParser.class);
	
	public static RequestFileEntity parseRequsetFileInfo(HttpServletRequest request, String paramName) {
		String fileName = null;
		byte[] fileContent = null;
		String format = null;
		Long size= null;
		Integer width = null;
		Integer heigh = null;
		if (request instanceof MultipartHttpServletRequest) {// 获取图片
			// 转型为MultipartHttpRequest(重点的所在)
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			// 根据前台的name名称得到上传的文件
			MultipartFile imgProfile = multipartRequest.getFile(paramName);
			// String fileName=imgProfile.getOriginalFilename();//取得文件名
			// String fileType = imgProfile.getContentType();// 取得上传文件的类型和格式
			// String format = fileType.substring(fileType.indexOf("/") + 1,
			// fileType.length()).toLowerCase();// 取得上传文件格式
			if(imgProfile!=null){
				fileName = imgProfile.getOriginalFilename();
				format = fileName.substring(fileName.lastIndexOf(".") + 1);
				size = imgProfile.getSize();
				try {
					BufferedImage bi = ImageIO.read(imgProfile.getInputStream());
					width = bi.getWidth();
					heigh = bi.getHeight();
				} catch (Exception e) {
				}
				try {
					fileContent = imgProfile.getBytes();
				} catch (IOException e) {
					logger.info("CommRequestFileParser.parseRequsetFileInfo.getBytes.error", e);
					throw new BusinessRuntimeException("CommRequestFileParser.parseRequsetFileInfo.getBytes.error",new Object[]{paramName});
				}
			}
			
		}
		RequestFileEntity fileReqEntity = new RequestFileEntity(fileName, fileContent,format,size);
		fileReqEntity.setWidth(width);
		fileReqEntity.setHeigh(heigh);
		return fileReqEntity;
	}
	
	public static List<RequestFileEntity> parseRequsetFileInfo(HttpServletRequest request, List<String> paramNameList) {
		if(paramNameList==null){
			return null;
		}
		List<RequestFileEntity> resList = new ArrayList<RequestFileEntity>();
		for(String paramName:paramNameList){
			RequestFileEntity tmpEntity=parseRequsetFileInfo(request, paramName);
			if(tmpEntity!=null&&tmpEntity.getFileContent()!=null){
				resList.add(tmpEntity);
			}
		}
		return resList;
	}
	
	public static List<RequestFileEntity> parseRequsetFileInfoDimLike(HttpServletRequest request,String paramNameStartWith) {
		List<String> picInfoParams = null;
		{
			if (request instanceof MultipartHttpServletRequest) {// 获取图片
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				Iterator<String> paramNames=multipartRequest.getFileNames();
				while(paramNames.hasNext()){
					String tmpName=paramNames.next();
					if(tmpName.startsWith(paramNameStartWith)){
						if(picInfoParams==null){
							picInfoParams=new ArrayList<String>();
						}
						picInfoParams.add(tmpName);
					}
				}
			}
		}
		List<RequestFileEntity> picList = CommRequestFileParser.parseRequsetFileInfo(request, picInfoParams);
		return picList;
	}
	
}
