package com.cnfantasia.server.domainbase.propertyRepairer.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(管理处维修工) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PropertyRepairer implements Serializable{
*/


public class PropertyRepairer extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PropertyRepairer(){
	}
	public PropertyRepairer(PropertyRepairer arg){
		this.id = arg.getId();
	}
	/**
	public PropertyRepairer(BigInteger id,String idNo,String idNumberPic1,String idNumberPic2,String tel,String name,String headimgurl,BigInteger tPropertyManagementFId,BigInteger tPropertyRepairTypeFId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger tUserFId){
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
		PropertyRepairer other = (PropertyRepairer) obj;
		if (id == null) {
		return true;
	}
	
}