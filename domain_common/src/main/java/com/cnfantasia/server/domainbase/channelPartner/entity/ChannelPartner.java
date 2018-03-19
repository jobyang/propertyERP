package com.cnfantasia.server.domainbase.channelPartner.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(渠道合伙人) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class ChannelPartner implements Serializable{
*/


public class ChannelPartner extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public ChannelPartner(){
	}
	public ChannelPartner(ChannelPartner arg){
		this.id = arg.getId();
	}
	/**
	public ChannelPartner(BigInteger id,String name,String positiondesc,String companyName,String phone,String inviteCode,String email,String bankName,String bankAccountName,String bankCardNo,String bankBranch,String bankProvince,String bankCity,Integer revenueDate,String idNumber,String partnertype,BigInteger tOmsUserFId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,String businessLicense){
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
		ChannelPartner other = (ChannelPartner) obj;
		if (id == null) {
		return true;
	}
	
}