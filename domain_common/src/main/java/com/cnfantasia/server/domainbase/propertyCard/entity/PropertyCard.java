package com.cnfantasia.server.domainbase.propertyCard.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(物业代扣卡) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PropertyCard implements Serializable{
*/


public class PropertyCard extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PropertyCard(){
	}
	public PropertyCard(PropertyCard arg){
		this.id = arg.getId();
	}
	/**
	public PropertyCard(BigInteger id,Long cardAmount,Long discountAmt,Long realPayAmt,Integer sellState,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Integer discountType){
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
		PropertyCard other = (PropertyCard) obj;
		if (id == null) {
		return true;
	}
	
}