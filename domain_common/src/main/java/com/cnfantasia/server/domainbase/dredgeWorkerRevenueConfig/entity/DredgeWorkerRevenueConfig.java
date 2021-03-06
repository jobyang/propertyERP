package com.cnfantasia.server.domainbase.dredgeWorkerRevenueConfig.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.Integer;import java.lang.Double;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(疏通师傅收益配置) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class DredgeWorkerRevenueConfig implements Serializable{
*/


public class DredgeWorkerRevenueConfig extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/** 师傅id */	private BigInteger tUserFId;	/** 规则类型 */	private Integer ruleType;	/** 平台收益占比 */	private Double platformValue;	/** 有效状态 */	private Integer activeStatus;
	public DredgeWorkerRevenueConfig(){
	}
	public DredgeWorkerRevenueConfig(DredgeWorkerRevenueConfig arg){
		this.id = arg.getId();		this.tUserFId = arg.gettUserFId();		this.ruleType = arg.getRuleType();		this.platformValue = arg.getPlatformValue();		this.activeStatus = arg.getActiveStatus();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param tUserFId 师傅id	 * @param ruleType 规则类型	 * @param platformValue 平台收益占比	 * @param activeStatus 有效状态	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 */
	public DredgeWorkerRevenueConfig(BigInteger id,BigInteger tUserFId,Integer ruleType,Double platformValue,Integer activeStatus,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.tUserFId = tUserFId;		this.ruleType = ruleType;		this.platformValue = platformValue;		this.activeStatus = activeStatus;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("tUserFId=").append(tUserFId).append(";");		sbf.append("ruleType=").append(ruleType).append(";");		sbf.append("platformValue=").append(platformValue).append(";");		sbf.append("activeStatus=").append(activeStatus).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public BigInteger gettUserFId() {		return tUserFId;	}	public void settUserFId(BigInteger tUserFId) {		this.tUserFId = tUserFId;	}	public Integer getRuleType() {		return ruleType;	}	public void setRuleType(Integer ruleType) {		this.ruleType = ruleType;	}	public Double getPlatformValue() {		return platformValue;	}	public void setPlatformValue(Double platformValue) {		this.platformValue = platformValue;	}	public Integer getActiveStatus() {		return activeStatus;	}	public void setActiveStatus(Integer activeStatus) {		this.activeStatus = activeStatus;	}
	
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
		DredgeWorkerRevenueConfig other = (DredgeWorkerRevenueConfig) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
