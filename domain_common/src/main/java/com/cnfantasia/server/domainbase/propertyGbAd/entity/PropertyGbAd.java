package com.cnfantasia.server.domainbase.propertyGbAd.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.String;import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(小区物业打印广告配置表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PropertyGbAd implements Serializable{
*/


public class PropertyGbAd extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/** 小区Id */	private BigInteger gbId;	/** 图标地址 */	private String icon;	/** 最近更新时间 */	private String lastUpdTime;	/** 描述 */	private String desc;
	public PropertyGbAd(){
	}
	public PropertyGbAd(PropertyGbAd arg){
		this.id = arg.getId();		this.gbId = arg.getGbId();		this.icon = arg.getIcon();		this.lastUpdTime = arg.getLastUpdTime();		this.desc = arg.getDesc();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param gbId 小区Id	 * @param icon 图标地址	 * @param lastUpdTime 最近更新时间	 * @param desc 描述	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 */
	public PropertyGbAd(BigInteger id,BigInteger gbId,String icon,String lastUpdTime,String desc,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.gbId = gbId;		this.icon = icon;		this.lastUpdTime = lastUpdTime;		this.desc = desc;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("gbId=").append(gbId).append(";");		sbf.append("icon=").append(icon).append(";");		sbf.append("lastUpdTime=").append(lastUpdTime).append(";");		sbf.append("desc=").append(desc).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public BigInteger getGbId() {		return gbId;	}	public void setGbId(BigInteger gbId) {		this.gbId = gbId;	}	public String getIcon() {		return icon;	}	public void setIcon(String icon) {		this.icon = icon;	}	public String getLastUpdTime() {		return lastUpdTime;	}	public void setLastUpdTime(String lastUpdTime) {		this.lastUpdTime = lastUpdTime;	}	public String getDesc() {		return desc;	}	public void setDesc(String desc) {		this.desc = desc;	}
	
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
		PropertyGbAd other = (PropertyGbAd) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
