package com.cnfantasia.server.domainbase.cashSqpayBt.entity;

/* */ import java.io.Serializable;/* */
import java.math.BigInteger;
/*  import com.cnfantasia.server.domain.pub.BaseEntity; */
/**
 * 描述:(双乾支付优惠补贴明细表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/* */
public class CashSqpayBt implements Serializable{
/* */

/* 
public class CashSqpayBt extends BaseEntity{
 */
	private static final long serialVersionUID = 1L;
	/**  */
	public CashSqpayBt(){
	}
	public CashSqpayBt(CashSqpayBt arg){
		this.id = arg.getId();
	}
	/**
	public CashSqpayBt(BigInteger id,BigInteger tEbuyOrderFId,String goalName,Integer orderType,Long amountBt){
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
		CashSqpayBt other = (CashSqpayBt) obj;
		if (id == null) {
		return true;
	}
	
}