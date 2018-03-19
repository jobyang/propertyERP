package com.cnfantasia.server.domainbase.ebuyProductTemp.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(商品表，临时存储从外部抓取的数据) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyProductTemp implements Serializable{
*/


public class EbuyProductTemp extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyProductTemp(){
	}
	public EbuyProductTemp(EbuyProductTemp arg){
		this.id = arg.getId();
	}
	/**
	public EbuyProductTemp(BigInteger id,BigInteger tSupplyMerchantFId,String name,String nameMini,Long price,Long priceDiscount,String createTime,String picBase,String picBaseMini,String priceUnit,String specification,String desc,Integer status,Integer isSync,String upShelfTime,String downShelfTime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger srcId,String fromWhere,BigInteger srcProductTypeId,BigInteger tEbuyProductTypeFId,BigInteger leftCount){
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
		EbuyProductTemp other = (EbuyProductTemp) obj;
		if (id == null) {
		return true;
	}
	
}