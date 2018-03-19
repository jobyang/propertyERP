package com.cnfantasia.server.domainbase.building.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(建筑单元) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class Building implements Serializable{
*/


public class Building extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public Building(){
	}
	public Building(Building arg){
		this.id = arg.getId();
	}
	/**
	public Building(BigInteger id,BigInteger tGroupBuildingFId,String name,String nameDigitOrder,String nameCharOrder,Integer checkStatus,BigInteger tGroupBuildingFIdTmp,String code,BigInteger creater,Integer sourceType,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Integer keyStatus){
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
		Building other = (Building) obj;
		if (id == null) {
		return true;
	}
	
}