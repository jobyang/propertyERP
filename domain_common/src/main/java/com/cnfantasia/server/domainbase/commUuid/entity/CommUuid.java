package com.cnfantasia.server.domainbase.commUuid.entity;

/* import java.io.Serializable;*/
import java.lang.String;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(唯一编号) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class CommUuid implements Serializable{
*/


public class CommUuid extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 表名 */
	public CommUuid(){
	}
	public CommUuid(CommUuid arg){
		this.tableName = arg.getTableName();
	}
	/**
	public CommUuid(String tableName,BigInteger number,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
	}
	
	public String getTableName() {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
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
		CommUuid other = (CommUuid) obj;
		if (tableName == null) {
		return true;
	}
	
}