package com.cnfantasia.server.domainbase.microblogPushType.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(街坊消息推送类别表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class MicroblogPushType implements Serializable{
*/


public class MicroblogPushType extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public MicroblogPushType(){
	}
	public MicroblogPushType(MicroblogPushType arg){
		this.id = arg.getId();
	}
	/**
	public MicroblogPushType(BigInteger id,String name,String code,Long priority,Long validityHours,Long count,String desc,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		MicroblogPushType other = (MicroblogPushType) obj;
		if (id == null) {
		return true;
	}
	
}