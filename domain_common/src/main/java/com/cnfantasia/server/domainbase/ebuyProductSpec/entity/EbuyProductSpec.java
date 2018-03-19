package com.cnfantasia.server.domainbase.ebuyProductSpec.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(商品价格规格表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyProductSpec implements Serializable{
*/


public class EbuyProductSpec extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyProductSpec(){
	}
	public EbuyProductSpec(EbuyProductSpec arg){
		this.id = arg.getId();
	}
	/**
	public EbuyProductSpec(BigInteger id,BigInteger tEbuyProductFId,Integer pointType,Long price,Long priceDiscount,Long pricePoint,Long priceDiscountPoint,String phoneAmount,String phoneAgentType,String size,String colour,BigInteger leftCount,BigInteger selNum,String picBase,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		EbuyProductSpec other = (EbuyProductSpec) obj;
		if (id == null) {
		return true;
	}
	
}