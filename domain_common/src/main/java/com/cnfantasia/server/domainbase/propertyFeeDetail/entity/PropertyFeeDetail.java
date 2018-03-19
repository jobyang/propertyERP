package com.cnfantasia.server.domainbase.propertyFeeDetail.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(物业费费用清单详情) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PropertyFeeDetail implements Serializable{
*/


public class PropertyFeeDetail extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PropertyFeeDetail(){
	}
	public PropertyFeeDetail(PropertyFeeDetail arg){
		this.id = arg.getId();
	}
	/**
	public PropertyFeeDetail(BigInteger id,BigInteger tPayBillFId,BigInteger tCycleId,Integer type,String name,Double signalPrice,String signalPriceStr,String priceUnitName,Long priceUnitValue,Double totalAmount,Double unpaid,Double totalPrice,Long allowancePrice,Integer feeType,Long billMonthSize,BigInteger itemHasRoomId,String mrName,Double multiplierTimes,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		PropertyFeeDetail other = (PropertyFeeDetail) obj;
		if (id == null) {
		return true;
	}
	
}