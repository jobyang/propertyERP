package com.cnfantasia.server.domainbase.gbSoftwareConfig.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(小区物业软件配置) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class GbSoftwareConfig implements Serializable{
*/


public class GbSoftwareConfig extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public GbSoftwareConfig(){
	}
	public GbSoftwareConfig(GbSoftwareConfig arg){
		this.id = arg.getId();
	}
	/**
	public GbSoftwareConfig(BigInteger id,BigInteger gbId,String softwareGbId,String ipAddress,Integer softwareType,String databaseCode,String rsaPublicKey,String rsaPrivateKey,String serviceClassName,Integer cannotConnectStartDate,Integer cannotConnectEndDate,Integer isValid,BigInteger defaultRepairerId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		GbSoftwareConfig other = (GbSoftwareConfig) obj;
		if (id == null) {
		return true;
	}
	
}