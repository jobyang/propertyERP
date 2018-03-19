package com.cnfantasia.server.domainbase.familyMsgExtData.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(家庭留言板拓展信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class FamilyMsgExtData implements Serializable{
*/


public class FamilyMsgExtData extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public FamilyMsgExtData(){
	}
	public FamilyMsgExtData(FamilyMsgExtData arg){
		this.id = arg.getId();
	}
	/**
	public FamilyMsgExtData(BigInteger id,BigInteger tFamilyMsgFId,BigInteger dataId,Integer dataType,String epName,String epNameMini,Long epPrice,Long epPriceDiscount,String epPicBase,String epPicBaseMini,String epPriceUnit,String epDesc,Long epPricePoint,Long epPriceDiscountPoint,Integer epPointType,Integer epSpecialProductType,BigInteger epBuycarId,BigInteger epBuycarProductId,Long epBuycarQty,String epBuycarCreateTime,BigInteger kcbCollectUser,String kcbCollectTime,String kcbName,String kcbPicUrl,String kcbDesc,String kcbEatWeight,String kcbCookTime,String kcbCookStep,String kcbTaste,String kcbCookTech,String kcbTips,String prPrizeTime,Double prDiscount,BigInteger prUserRoomId,String prEndTime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		FamilyMsgExtData other = (FamilyMsgExtData) obj;
		if (id == null) {
		return true;
	}
	
}