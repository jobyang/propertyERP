package com.cnfantasia.server.domainbase.msPrizeGift.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(奖品详情表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class MsPrizeGift implements Serializable{
*/


public class MsPrizeGift extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public MsPrizeGift(){
	}
	public MsPrizeGift(MsPrizeGift arg){
		this.id = arg.getId();
	}
	/**
	public MsPrizeGift(BigInteger id,BigInteger prizeOptionId,Double number,String unit,Integer convertStatus,String convertTime,BigInteger convertUserId,BigInteger convertRoomId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger prizeActId){
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
		MsPrizeGift other = (MsPrizeGift) obj;
		if (id == null) {
		return true;
	}
	
}