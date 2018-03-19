package com.cnfantasia.server.domainbase.ebuyPrepayWeixinLog.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(微信预支付日志表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyPrepayWeixinLog implements Serializable{
*/


public class EbuyPrepayWeixinLog extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyPrepayWeixinLog(){
	}
	/**
	public EbuyPrepayWeixinLog(BigInteger id,BigInteger orderId,BigInteger userId,String accessToken,String notifyUrl,String packageParams,String packageValue,String prepayId,String prepayIdParams,String clientBackParams,String retcode,String debugInfo,String errInfo,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
	}
	
	public BigInteger getId() {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EbuyPrepayWeixinLog other = (EbuyPrepayWeixinLog) obj;
		if (id == null) {
		return true;
	}
	
}