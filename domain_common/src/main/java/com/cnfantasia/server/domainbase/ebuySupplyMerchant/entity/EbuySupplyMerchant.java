package com.cnfantasia.server.domainbase.ebuySupplyMerchant.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(供应商) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuySupplyMerchant implements Serializable{
*/


public class EbuySupplyMerchant extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuySupplyMerchant(){
	}
	public EbuySupplyMerchant(EbuySupplyMerchant arg){
		this.id = arg.getId();
	}
	/**
	public EbuySupplyMerchant(BigInteger id,String name,Integer type,String address,BigInteger tAddressBlockFId,String tel,String linkName,String email,String fax,String storePic,String proPic,String shopPhotoes,String distance,String deliveTime,String startTime,String endTime,Integer isfetch,String userName,String ownerPhone,String ownerIdPhotoes,Integer autoConfirmReceivePeriod,String introduce,Integer storeAuditStatus,String storeAuditDesc,String storeAuditTime,BigInteger storeAuditorId,Integer ownerAuditStatus,String ownerAuditDesc,String ownerAuditTime,BigInteger ownerAuditorId,Long leastDeliveryAmt,Long maxDeliveryAmt,Integer revenueType,Double revenueRate,Integer order,Integer expressType,String withdrawPassword,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		EbuySupplyMerchant other = (EbuySupplyMerchant) obj;
		if (id == null) {
		return true;
	}
	
}