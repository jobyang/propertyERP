package com.cnfantasia.server.domainbase.familyMsg.service;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;
import com.cnfantasia.server.domainbase.familyMsg.entity.FamilyMsg;

/**
 * 描述:(家庭留言板) 服务类接口定义
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IFamilyMsgBaseService {
	
	/**
	 * 根据条件查询(家庭留言板)信息,精确查询
	 * @param paramMap 
	 * @return
	 */
	public List<FamilyMsg> getFamilyMsgByCondition(Map<String,Object> paramMap);
	/**
	 * 根据条件查询(家庭留言板)信息,模糊查询
	 * @param paramMap 
	 * @return
	 */
	public List<FamilyMsg> getFamilyMsgByConditionDim(Map<String,Object> paramMap);
	/**
	 * 按条件分页查询(家庭留言板)信息,精确查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<FamilyMsg> getFamilyMsgByCondition(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 按条件分页查询(家庭留言板)信息,模糊查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<FamilyMsg> getFamilyMsgByConditionDim(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 根据序列号查询(家庭留言板)信息
	 * @param id
	 * @return
	 */
	public FamilyMsg getFamilyMsgBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(家庭留言板)记录数,精确查询
	 * @param paramMap
	 * @return
	 */
	public int getFamilyMsgCount(Map<String,Object> paramMap);
	/**
	 * 根据条件查询满足条件的(家庭留言板)记录数,模糊查询
	 * @param paramMap
	 * @return
	 */
	public int getFamilyMsgCountDim(Map<String,Object> paramMap);
	/**
	 * 往(家庭留言板)新增一条记录
	 * @param familyMsg
	 * @return
	 */
	public int insertFamilyMsg(FamilyMsg familyMsg);
	/**
	 * 批量新增(家庭留言板)
	 * @param familyMsgList
	 * @return
	 */
	public int insertFamilyMsgBatch(List<FamilyMsg> familyMsgList);
	/**
	 * 更新(家庭留言板)信息
	 * @param familyMsg
	 * @return
	 */
	public int updateFamilyMsg(FamilyMsg familyMsg);
	/**
	 * 批量更新(家庭留言板)信息
	 * @param familyMsgList
	 * @return
	 */
	public int updateFamilyMsgBatch(List<FamilyMsg> familyMsgList);
	/**
	 * 根据序列号删除(家庭留言板)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteFamilyMsgLogic(java.math.BigInteger id);
	
	/**
	 * 根据序列号批量删除(家庭留言板)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteFamilyMsgLogicBatch(List<java.math.BigInteger> idList);
	
//	/**
//	 * 根据序列号删除(家庭留言板)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteFamilyMsg(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(家庭留言板)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteFamilyMsgBatch(List<java.math.BigInteger> idList);
	
}
