package com.cnfantasia.server.ms.commSysPara.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cnfantasia.server.ms.commSysPara.dao.ICommSysParaDao;
import com.cnfantasia.server.ms.pub.sysParam.ISysParamService;
import com.cnfantasia.server.ms.pub.sysParam.SysParamManager;
import com.cnfantasia.server.msbase.omsCommSysPara.entity.OmsCommSysPara;
import com.cnfantasia.server.msbase.omsCommSysPara.service.OmsCommSysParaBaseService;
//import com.cnfantasia.server.ms.commSysPara.dao.IOmsCommSysParaDao;
/**
 * 描述:(系统参数) 具体业务Service层实现
 * 
 * @version 1.00
 * @author null
 * 
 */
@Service
public class CommSysParaService extends OmsCommSysParaBaseService implements ICommSysParaService,ISysParamService{
	private ICommSysParaDao commSysParaDao;
	
	public void setCommSysParaDao(ICommSysParaDao commSysParaDao) {
		this.commSysParaDao = commSysParaDao;
	}
	
	@Override
	public List<Map<String, Object>> getAllSysParamListMap() {
		List<OmsCommSysPara> paramList = commSysParaDao.selectOmsCommSysParaByCondition(null, true);
		List<Map<String,Object>> resList = new ArrayList<Map<String,Object>>();
		for(OmsCommSysPara tmpPara:paramList){
			Map<String,Object> tmpMap = new HashMap<String, Object>();
			tmpMap.put(SysParamManager.SYSPARA_CODE, tmpPara.getSysParaCode());
			tmpMap.put(SysParamManager.SYSPARA_VALUE, tmpPara.getSysParaValue());
			resList.add(tmpMap);
		}
		return resList;
	}
	
	
	
}
