package com.cnfantasia.server.domainbase.addressBlock.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.String;import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(区) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class AddressBlock implements Serializable{
*/


public class AddressBlock extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/**  */	private String name;	/**  */	private BigInteger tCityFId;	/** 国家标准代码 */	private String countryCode;	/** 国家标准代码,包含后面的0 */	private String countryCodeAll;
	public AddressBlock(){
	}
	public AddressBlock(AddressBlock arg){
		this.id = arg.getId();		this.name = arg.getName();		this.tCityFId = arg.gettCityFId();		this.countryCode = arg.getCountryCode();		this.countryCodeAll = arg.getCountryCodeAll();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param name 	 * @param tCityFId 	 * @param countryCode 国家标准代码	 * @param countryCodeAll 国家标准代码,包含后面的0	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 */
	public AddressBlock(BigInteger id,String name,BigInteger tCityFId,String countryCode,String countryCodeAll,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.name = name;		this.tCityFId = tCityFId;		this.countryCode = countryCode;		this.countryCodeAll = countryCodeAll;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("name=").append(name).append(";");		sbf.append("tCityFId=").append(tCityFId).append(";");		sbf.append("countryCode=").append(countryCode).append(";");		sbf.append("countryCodeAll=").append(countryCodeAll).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public BigInteger gettCityFId() {		return tCityFId;	}	public void settCityFId(BigInteger tCityFId) {		this.tCityFId = tCityFId;	}	public String getCountryCode() {		return countryCode;	}	public void setCountryCode(String countryCode) {		this.countryCode = countryCode;	}	public String getCountryCodeAll() {		return countryCodeAll;	}	public void setCountryCodeAll(String countryCodeAll) {		this.countryCodeAll = countryCodeAll;	}
	
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
		AddressBlock other = (AddressBlock) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
