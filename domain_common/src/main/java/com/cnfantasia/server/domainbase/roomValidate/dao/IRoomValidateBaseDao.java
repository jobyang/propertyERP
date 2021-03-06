package com.cnfantasia.server.domainbase.roomValidate.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.roomValidate.entity.RoomValidate;

/**
 * 描述:(门牌校验信息) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IRoomValidateBaseDao {
	/**
	 * 根据条件查询(门牌校验信息)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<RoomValidate> selectRoomValidateByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(门牌校验信息)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<RoomValidate> selectRoomValidateByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(门牌校验信息)信息
	 * @param id
	 * @return
	 */
	public RoomValidate selectRoomValidateBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(门牌校验信息)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectRoomValidateCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(门牌校验信息)新增一条记录
	 * @param roomValidate
	 * @return
	 */
	public int insertRoomValidate(RoomValidate roomValidate);
	
	/**
	 * 批量新增(门牌校验信息)信息
	 * @param roomValidateList
	 * @return
	 */
	public int insertRoomValidateBatch(List<RoomValidate> roomValidateList);
	
	/**
	 * 更新(门牌校验信息)信息
	 * @param roomValidate
	 * @return
	 */
	public int updateRoomValidate(RoomValidate roomValidate);
	
	/**
	 * 批量更新(门牌校验信息)信息
	 * @param roomValidateList
	 * @return
	 */
	public int updateRoomValidateBatch(List<RoomValidate> roomValidateList);
	
	/**
	 * 根据序列号删除(门牌校验信息)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteRoomValidateLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(门牌校验信息)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteRoomValidateLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(门牌校验信息)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteRoomValidate(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(门牌校验信息)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteRoomValidateBatch(List<java.math.BigInteger> idList);
	
	
}
