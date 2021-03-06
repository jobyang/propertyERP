package com.cnfantasia.server.domainbase.pointData.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.pointData.entity.PointData;

/**
 * 描述:(用户积分表) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class PointDataBaseDao extends AbstractBaseDao implements IPointDataBaseDao{
	/**
	 * 根据条件查询(用户积分表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<PointData> selectPointDataByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("pointDataBase.select_pointData",paramMap);
	}
	/**
	 * 按条件分页查询(用户积分表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<PointData> selectPointDataByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectPointDataCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<PointData> resMap= sqlSession.selectList("pointDataBase.select_pointData_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(用户积分表)信息
	 * @param id
	 * @return
	 */
	@Override
	public PointData selectPointDataBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("pointDataBase.select_pointData_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(用户积分表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectPointDataCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("pointDataBase.select_pointData_count", paramMap);
	}
	/**
	 * 往(用户积分表)新增一条记录
	 * @param pointData
	 * @return
	 */
	@Override
	public int insertPointData(PointData pointData){
		return sqlSession.insert("pointDataBase.insert_pointData",pointData);
	}
	/**
	 * 批量新增(用户积分表)信息
	 * @param pointDataList
	 * @return
	 */
	@Override
	public int insertPointDataBatch(List<PointData> pointDataList) {
		return sqlSession.insert("pointDataBase.insert_pointData_Batch",pointDataList);
	}
	
	/**
	 * 更新(用户积分表)信息
	 * @param pointData
	 * @return
	 */
	@Override
	public int updatePointData(PointData pointData){
		return sqlSession.update("pointDataBase.update_pointData", pointData);
	}
	/**
	 * 批量更新(用户积分表)信息
	 * @param pointDataList
	 * @return
	 */
	@Override
	public int updatePointDataBatch(List<PointData> pointDataList) {
		return sqlSession.update("pointDataBase.update_pointData_Batch", pointDataList);
	}
	
	/**
	 * 根据序列号删除(用户积分表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deletePointDataLogic(java.math.BigInteger id){
		PointData pointData = new PointData();
		pointData.setId(id);
		pointData.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("pointDataBase.delete_pointData_Logic",pointData);
	}
	
	/**
	 * 根据Id 批量删除(用户积分表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deletePointDataLogicBatch(List<java.math.BigInteger> idList) {
		List<PointData> delList = new java.util.ArrayList<PointData>();
		for(java.math.BigInteger id:idList){
			PointData pointData = new PointData();
			pointData.setId(id);
			pointData.setSys0DelState(RecordState_DELETED);
			delList.add(pointData);
		}
		return sqlSession.update("pointDataBase.delete_pointData_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(用户积分表)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deletePointData(java.math.BigInteger id){
//		return sqlSession.delete("pointDataBase.delete_pointData", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(用户积分表)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deletePointDataBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("pointDataBase.delete_pointData_Batch", idList);
//	}
	
	
}
