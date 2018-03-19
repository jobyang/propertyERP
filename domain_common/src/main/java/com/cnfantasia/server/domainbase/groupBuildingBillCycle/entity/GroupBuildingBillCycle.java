package com.cnfantasia.server.domainbase.groupBuildingBillCycle.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(账期管理) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class GroupBuildingBillCycle implements Serializable{
*/


public class GroupBuildingBillCycle extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public GroupBuildingBillCycle(){
	}
	public GroupBuildingBillCycle(GroupBuildingBillCycle arg){
		this.id = arg.getId();
	}
	/**
	public GroupBuildingBillCycle(BigInteger id,BigInteger tGroupBuildingId,BigInteger tPayBillTypeId,BigInteger tPayBillTimeCfgId,String billMonth,String billPayStart,String billPayEnd,String billMonthStart,String billMonthEnd,Integer paytimeType,Integer operateStatus,String feeType,BigInteger gbbcCfgId,Integer isCollectArrears,Integer isGenerateBill,String periodMonths,Integer chargingMode,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Integer bankCollectionStatus){
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
		GroupBuildingBillCycle other = (GroupBuildingBillCycle) obj;
		if (id == null) {
		return true;
	}
	
}