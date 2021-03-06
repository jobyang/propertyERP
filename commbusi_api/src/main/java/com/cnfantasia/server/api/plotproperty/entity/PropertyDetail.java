package com.cnfantasia.server.api.plotproperty.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @version:    1.0.0
 * Description:
 *
 * Modification History:
 * Date           Author           Version           Description
 * ------------------------------------------------------------------
 */
public class PropertyDetail implements Serializable {
	
	private static final long serialVersionUID = -767855952204097505L;

	private Integer payStatus; //支付状态
	
	private Boolean isBuyFinance; //是否购买物业宝进行抵扣
	
	private BigDecimal sucPay; //付款金额
	
	private BigDecimal totalAmt;//订单总金额
	
	private BigDecimal preferentialAmt;//优惠金额

	private BigDecimal JFBAmount;//粮票金额
	private Double JFBPercent;//粮票百分比

//	private Double discount; //折扣
	
//	private BigDecimal saveMoney; //节省金额
	
//	private String propertyPrice; //物业费
	
//	private String otherPrice; //其它费用
	
	private String payWay; //支付方式
	
	private String payTm; //支付时间
	
	private String proprietorName; //业主姓名
	
	private String addrBuilding; //
	
	private String addrRoom; //
	
	private String payLimiteStart;
	
	private String payLimiteEnd;
	
	private String couponDesc;

	private String orderNo;//交易单号
	
	private String orderId;//订单id
	
	private String managerTel;//管理处电话
	
	private String payBillId;//账单id
	
	private int clientPayStatus;//客户端支付状态

	//数据来源，0为系统账单，1为对接软件查询的数据
	private Integer dataFromType = 0;
	/**双乾补贴*/
	private BigDecimal sqAmountBt;
	private String sqCouponDesc;

	public Boolean getIsBuyFinance() {
		return isBuyFinance;
	}

	public void setIsBuyFinance(Boolean isBuyFinance) {
		this.isBuyFinance = isBuyFinance;
	}

	public BigDecimal getSucPay() {
		return sucPay;
	}

	public void setSucPay(BigDecimal sucPay) {
		this.sucPay = sucPay;
	}

//	public Double getDiscount() {
//		return discount;
//	}
//
//	public void setDiscount(Double discount) {
//		this.discount = discount;
//	}
//
//	public BigDecimal getSaveMoney() {
//		return saveMoney;
//	}
//
//	public void setSaveMoney(BigDecimal saveMoney) {
//		this.saveMoney = saveMoney;
//	}
//
//	public String getPropertyPrice() {
//		return propertyPrice;
//	}
//
//	public void setPropertyPrice(String propertyPrice) {
//		this.propertyPrice = propertyPrice;
//	}
//
//	public String getOtherPrice() {
//		return otherPrice;
//	}
//
//	public void setOtherPrice(String otherPrice) {
//		this.otherPrice = otherPrice;
//	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getPayTm() {
		return payTm;
	}

	public void setPayTm(String payTm) {
		this.payTm = payTm;
	}

	public String getProprietorName() {
		return proprietorName;
	}

	public void setProprietorName(String proprietorName) {
		this.proprietorName = proprietorName;
	}

	public String getAddrBuilding() {
		return addrBuilding;
	}

	public void setAddrBuilding(String addrBuilding) {
		this.addrBuilding = addrBuilding;
	}

	public String getAddrRoom() {
		return addrRoom;
	}

	public void setAddrRoom(String addrRoom) {
		this.addrRoom = addrRoom;
	}

	public String getPayLimiteStart() {
		return payLimiteStart;
	}

	public void setPayLimiteStart(String payLimiteStart) {
		this.payLimiteStart = payLimiteStart;
	}

	public String getPayLimiteEnd() {
		return payLimiteEnd;
	}

	public void setPayLimiteEnd(String payLimiteEnd) {
		this.payLimiteEnd = payLimiteEnd;
	}
	
	public String getCouponDesc() {
		return couponDesc;
	}
	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}
	
	/**应缴费用详细*/
	private List<Map<String,Object>> feeDetail;
	public List<Map<String, Object>> getFeeDetail() {
		return feeDetail;
	}
	public void setFeeDetail(List<Map<String, Object>> feeDetail) {
		this.feeDetail = feeDetail;
	}
	
	/**账单显示名称*/
	private String topName;
	public String getTopName() {
		return topName;
	}
	public void setTopName(String topName) {
		this.topName = topName;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getPreferentialAmt() {
		return preferentialAmt;
	}

	public void setPreferentialAmt(BigDecimal preferentialAmt) {
		this.preferentialAmt = preferentialAmt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getManagerTel() {
		return managerTel;
	}

	public void setManagerTel(String managerTel) {
		this.managerTel = managerTel;
	}

	public String getPayBillId() {
		return payBillId;
	}

	public void setPayBillId(String payBillId) {
		this.payBillId = payBillId;
	}

	public int getClientPayStatus() {
		return clientPayStatus;
	}

	public void setClientPayStatus(int clientPayStatus) {
		this.clientPayStatus = clientPayStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public BigDecimal getJFBAmount() {
		return JFBAmount;
	}

	public void setJFBAmount(BigDecimal JFBAmount) {
		this.JFBAmount = JFBAmount;
	}

	public Double getJFBPercent() {
		return JFBPercent;
	}

	public void setJFBPercent(Double JFBPercent) {
		this.JFBPercent = JFBPercent;
	}

	public Integer getDataFromType() {
		return dataFromType;
	}

	public void setDataFromType(Integer dataFromType) {
		this.dataFromType = dataFromType;
	}

	public BigDecimal getSqAmountBt() {
		return sqAmountBt;
	}

	public void setSqAmountBt(BigDecimal sqAmountBt) {
		this.sqAmountBt = sqAmountBt;
	}

	public String getSqCouponDesc() {
		return sqCouponDesc;
	}

	public void setSqCouponDesc(String sqCouponDesc) {
		this.sqCouponDesc = sqCouponDesc;
	}
	
}
