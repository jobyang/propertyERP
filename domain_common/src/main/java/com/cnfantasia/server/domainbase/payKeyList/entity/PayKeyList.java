package com.cnfantasia.server.domainbase.payKeyList.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(云钥匙付款列表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PayKeyList implements Serializable{
*/


public class PayKeyList extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 主键,同t_ebuy_product.f_id */
	public PayKeyList(){
	}
	public PayKeyList(PayKeyList arg){
		this.id = arg.getId();
	}
	/**
	public PayKeyList(BigInteger id,String desc,Integer sys0DelState,Long payPrice,Long payTime){
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
		PayKeyList other = (PayKeyList) obj;
		if (id == null) {
		return true;
	}
	
}