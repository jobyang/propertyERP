package com.cnfantasia.server.domainbase.ebuyProductHasTEbuyDeliveryMethod.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.ebuyProductHasTEbuyDeliveryMethod.entity.EbuyProductHasTEbuyDeliveryMethod;

/**
 * 描述:(商品支持的配送方式) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class EbuyProductHasTEbuyDeliveryMethodBaseDao extends AbstractBaseDao implements IEbuyProductHasTEbuyDeliveryMethodBaseDao{
	/**
	 * 根据条件查询(商品支持的配送方式)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<EbuyProductHasTEbuyDeliveryMethod> selectEbuyProductHasTEbuyDeliveryMethodByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("ebuyProductHasTEbuyDeliveryMethodBase.select_ebuyProductHasTEbuyDeliveryMethod",paramMap);
	}
	/**
	 * 按条件分页查询(商品支持的配送方式)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<EbuyProductHasTEbuyDeliveryMethod> selectEbuyProductHasTEbuyDeliveryMethodByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectEbuyProductHasTEbuyDeliveryMethodCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<EbuyProductHasTEbuyDeliveryMethod> resMap= sqlSession.selectList("ebuyProductHasTEbuyDeliveryMethodBase.select_ebuyProductHasTEbuyDeliveryMethod_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(商品支持的配送方式)信息
	 * @param id
	 * @return
	 */
	@Override
	public EbuyProductHasTEbuyDeliveryMethod selectEbuyProductHasTEbuyDeliveryMethodBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("ebuyProductHasTEbuyDeliveryMethodBase.select_ebuyProductHasTEbuyDeliveryMethod_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(商品支持的配送方式)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectEbuyProductHasTEbuyDeliveryMethodCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("ebuyProductHasTEbuyDeliveryMethodBase.select_ebuyProductHasTEbuyDeliveryMethod_count", paramMap);
	}
	/**
	 * 往(商品支持的配送方式)新增一条记录
	 * @param ebuyProductHasTEbuyDeliveryMethod
	 * @return
	 */
	@Override
	public int insertEbuyProductHasTEbuyDeliveryMethod(EbuyProductHasTEbuyDeliveryMethod ebuyProductHasTEbuyDeliveryMethod){
		return sqlSession.insert("ebuyProductHasTEbuyDeliveryMethodBase.insert_ebuyProductHasTEbuyDeliveryMethod",ebuyProductHasTEbuyDeliveryMethod);
	}
	/**
	 * 批量新增(商品支持的配送方式)信息
	 * @param ebuyProductHasTEbuyDeliveryMethodList
	 * @return
	 */
	@Override
	public int insertEbuyProductHasTEbuyDeliveryMethodBatch(List<EbuyProductHasTEbuyDeliveryMethod> ebuyProductHasTEbuyDeliveryMethodList) {
		return sqlSession.insert("ebuyProductHasTEbuyDeliveryMethodBase.insert_ebuyProductHasTEbuyDeliveryMethod_Batch",ebuyProductHasTEbuyDeliveryMethodList);
	}
	
	/**
	 * 更新(商品支持的配送方式)信息
	 * @param ebuyProductHasTEbuyDeliveryMethod
	 * @return
	 */
	@Override
	public int updateEbuyProductHasTEbuyDeliveryMethod(EbuyProductHasTEbuyDeliveryMethod ebuyProductHasTEbuyDeliveryMethod){
		return sqlSession.update("ebuyProductHasTEbuyDeliveryMethodBase.update_ebuyProductHasTEbuyDeliveryMethod", ebuyProductHasTEbuyDeliveryMethod);
	}
	/**
	 * 批量更新(商品支持的配送方式)信息
	 * @param ebuyProductHasTEbuyDeliveryMethodList
	 * @return
	 */
	@Override
	public int updateEbuyProductHasTEbuyDeliveryMethodBatch(List<EbuyProductHasTEbuyDeliveryMethod> ebuyProductHasTEbuyDeliveryMethodList) {
		return sqlSession.update("ebuyProductHasTEbuyDeliveryMethodBase.update_ebuyProductHasTEbuyDeliveryMethod_Batch", ebuyProductHasTEbuyDeliveryMethodList);
	}
	
	/**
	 * 根据序列号删除(商品支持的配送方式)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteEbuyProductHasTEbuyDeliveryMethodLogic(java.math.BigInteger id){
		EbuyProductHasTEbuyDeliveryMethod ebuyProductHasTEbuyDeliveryMethod = new EbuyProductHasTEbuyDeliveryMethod();
		ebuyProductHasTEbuyDeliveryMethod.setId(id);
		ebuyProductHasTEbuyDeliveryMethod.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("ebuyProductHasTEbuyDeliveryMethodBase.delete_ebuyProductHasTEbuyDeliveryMethod_Logic",ebuyProductHasTEbuyDeliveryMethod);
	}
	
	/**
	 * 根据Id 批量删除(商品支持的配送方式)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteEbuyProductHasTEbuyDeliveryMethodLogicBatch(List<java.math.BigInteger> idList) {
		List<EbuyProductHasTEbuyDeliveryMethod> delList = new java.util.ArrayList<EbuyProductHasTEbuyDeliveryMethod>();
		for(java.math.BigInteger id:idList){
			EbuyProductHasTEbuyDeliveryMethod ebuyProductHasTEbuyDeliveryMethod = new EbuyProductHasTEbuyDeliveryMethod();
			ebuyProductHasTEbuyDeliveryMethod.setId(id);
			ebuyProductHasTEbuyDeliveryMethod.setSys0DelState(RecordState_DELETED);
			delList.add(ebuyProductHasTEbuyDeliveryMethod);
		}
		return sqlSession.update("ebuyProductHasTEbuyDeliveryMethodBase.delete_ebuyProductHasTEbuyDeliveryMethod_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(商品支持的配送方式)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteEbuyProductHasTEbuyDeliveryMethod(java.math.BigInteger id){
//		return sqlSession.delete("ebuyProductHasTEbuyDeliveryMethodBase.delete_ebuyProductHasTEbuyDeliveryMethod", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(商品支持的配送方式)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteEbuyProductHasTEbuyDeliveryMethodBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("ebuyProductHasTEbuyDeliveryMethodBase.delete_ebuyProductHasTEbuyDeliveryMethod_Batch", idList);
//	}
	
	
}
