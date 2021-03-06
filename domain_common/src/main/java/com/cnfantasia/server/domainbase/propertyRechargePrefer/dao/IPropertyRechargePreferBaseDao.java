package com.cnfantasia.server.domainbase.propertyRechargePrefer.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.propertyRechargePrefer.entity.PropertyRechargePrefer;

/**
 * 描述:(物业充值随机立减记录表) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IPropertyRechargePreferBaseDao {
	/**
	 * 根据条件查询(物业充值随机立减记录表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<PropertyRechargePrefer> selectPropertyRechargePreferByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(物业充值随机立减记录表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<PropertyRechargePrefer> selectPropertyRechargePreferByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(物业充值随机立减记录表)信息
	 * @param id
	 * @return
	 */
	public PropertyRechargePrefer selectPropertyRechargePreferBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(物业充值随机立减记录表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectPropertyRechargePreferCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(物业充值随机立减记录表)新增一条记录
	 * @param propertyRechargePrefer
	 * @return
	 */
	public int insertPropertyRechargePrefer(PropertyRechargePrefer propertyRechargePrefer);
	
	/**
	 * 批量新增(物业充值随机立减记录表)信息
	 * @param propertyRechargePreferList
	 * @return
	 */
	public int insertPropertyRechargePreferBatch(List<PropertyRechargePrefer> propertyRechargePreferList);
	
	/**
	 * 更新(物业充值随机立减记录表)信息
	 * @param propertyRechargePrefer
	 * @return
	 */
	public int updatePropertyRechargePrefer(PropertyRechargePrefer propertyRechargePrefer);
	
	/**
	 * 批量更新(物业充值随机立减记录表)信息
	 * @param propertyRechargePreferList
	 * @return
	 */
	public int updatePropertyRechargePreferBatch(List<PropertyRechargePrefer> propertyRechargePreferList);
	
	/**
	 * 根据序列号删除(物业充值随机立减记录表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deletePropertyRechargePreferLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(物业充值随机立减记录表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deletePropertyRechargePreferLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(物业充值随机立减记录表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deletePropertyRechargePrefer(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(物业充值随机立减记录表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deletePropertyRechargePreferBatch(List<java.math.BigInteger> idList);
	
	
}
