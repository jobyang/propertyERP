package com.cnfantasia.wl.wechat.model;

/* import java.io.Serializable;*/
import java.math.BigInteger;

import com.cnfantasia.server.domainbase.ebuyProductParameters.entity.EbuyProductParameters;
/**
 * 描述:(产品参数) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyProductParameters implements Serializable{
*/
public class EbuyProductParametersNew extends EbuyProductParameters{

	private static final long serialVersionUID = 1L;

	public EbuyProductParametersNew(){
	}
	/**
	public EbuyProductParametersNew(BigInteger id,BigInteger tEbuyProductFId,String tPropName,String tPropValue,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		super(id, tEbuyProductFId, tPropName, tPropValue, sys0AddTime, sys0UpdTime, sys0DelTime, sys0AddUser, sys0UpdUser, sys0DelUser, sys0DelState);
	}
	
	public BigInteger getTEbuyProductFId() {
		settEbuyProductFId(tEbuyProductFId);
		settPropName(tPropName);
		settPropValue(tPropValue);
	}
}