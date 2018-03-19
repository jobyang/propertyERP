package com.cnfantasia.server.domainbase.revenueConfig.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(收益规则配置表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class RevenueConfig implements Serializable{
*/


public class RevenueConfig extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public RevenueConfig(){
	}
	public RevenueConfig(RevenueConfig arg){
		this.id = arg.getId();
	}
	/**
	public RevenueConfig(BigInteger id,BigInteger companyId,Integer projectType,String startDate,String endDate,Integer ruleType,Double totalValue,Double masterValue,Double companyValue,Double agentValue,Double platformValue,Double repairValue,Double recommenderValue,Integer activeStatus,String usedRecLasttime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		RevenueConfig other = (RevenueConfig) obj;
		if (id == null) {
		return true;
	}
	
}