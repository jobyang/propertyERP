package com.cnfantasia.server.domainbase.omsPermiFunction.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(OMS功能表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class OmsPermiFunction implements Serializable{
*/


public class OmsPermiFunction extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public OmsPermiFunction(){
	}
	public OmsPermiFunction(OmsPermiFunction arg){
		this.id = arg.getId();
	}
	/**
	public OmsPermiFunction(BigInteger id,String name,String desc,String action,String param,Integer status,Integer menuFlag,Integer level,BigInteger parnetid,String number,String longnumber,Integer isleaf,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		OmsPermiFunction other = (OmsPermiFunction) obj;
		if (id == null) {
		return true;
	}
	
}