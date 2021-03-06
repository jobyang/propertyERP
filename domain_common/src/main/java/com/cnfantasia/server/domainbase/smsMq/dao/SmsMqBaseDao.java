package com.cnfantasia.server.domainbase.smsMq.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.smsMq.entity.SmsMq;

/**
 * 描述:(手机短信消息队列) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class SmsMqBaseDao extends AbstractBaseDao implements ISmsMqBaseDao{
	/**
	 * 根据条件查询(手机短信消息队列)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<SmsMq> selectSmsMqByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("smsMqBase.select_smsMq",paramMap);
	}
	/**
	 * 按条件分页查询(手机短信消息队列)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<SmsMq> selectSmsMqByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectSmsMqCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<SmsMq> resMap= sqlSession.selectList("smsMqBase.select_smsMq_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(手机短信消息队列)信息
	 * @param id
	 * @return
	 */
	@Override
	public SmsMq selectSmsMqBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("smsMqBase.select_smsMq_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(手机短信消息队列)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectSmsMqCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("smsMqBase.select_smsMq_count", paramMap);
	}
	/**
	 * 往(手机短信消息队列)新增一条记录
	 * @param smsMq
	 * @return
	 */
	@Override
	public int insertSmsMq(SmsMq smsMq){
		return sqlSession.insert("smsMqBase.insert_smsMq",smsMq);
	}
	/**
	 * 批量新增(手机短信消息队列)信息
	 * @param smsMqList
	 * @return
	 */
	@Override
	public int insertSmsMqBatch(List<SmsMq> smsMqList) {
		return sqlSession.insert("smsMqBase.insert_smsMq_Batch",smsMqList);
	}
	
	/**
	 * 更新(手机短信消息队列)信息
	 * @param smsMq
	 * @return
	 */
	@Override
	public int updateSmsMq(SmsMq smsMq){
		return sqlSession.update("smsMqBase.update_smsMq", smsMq);
	}
	/**
	 * 批量更新(手机短信消息队列)信息
	 * @param smsMqList
	 * @return
	 */
	@Override
	public int updateSmsMqBatch(List<SmsMq> smsMqList) {
		return sqlSession.update("smsMqBase.update_smsMq_Batch", smsMqList);
	}
	
	/**
	 * 根据序列号删除(手机短信消息队列)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteSmsMqLogic(java.math.BigInteger id){
		SmsMq smsMq = new SmsMq();
		smsMq.setId(id);
		smsMq.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("smsMqBase.delete_smsMq_Logic",smsMq);
	}
	
	/**
	 * 根据Id 批量删除(手机短信消息队列)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteSmsMqLogicBatch(List<java.math.BigInteger> idList) {
		List<SmsMq> delList = new java.util.ArrayList<SmsMq>();
		for(java.math.BigInteger id:idList){
			SmsMq smsMq = new SmsMq();
			smsMq.setId(id);
			smsMq.setSys0DelState(RecordState_DELETED);
			delList.add(smsMq);
		}
		return sqlSession.update("smsMqBase.delete_smsMq_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(手机短信消息队列)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteSmsMq(java.math.BigInteger id){
//		return sqlSession.delete("smsMqBase.delete_smsMq", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(手机短信消息队列)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteSmsMqBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("smsMqBase.delete_smsMq_Batch", idList);
//	}
	
	
}
