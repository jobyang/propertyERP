package com.cnfantasia.server.domainbase.ebuyOrderHasTPayBill.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.ebuyOrderHasTPayBill.entity.EbuyOrderHasTPayBill;

/**
 * 描述:() DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class EbuyOrderHasTPayBillBaseDao extends AbstractBaseDao implements IEbuyOrderHasTPayBillBaseDao{
	/**
	 * 根据条件查询()信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<EbuyOrderHasTPayBill> selectEbuyOrderHasTPayBillByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("ebuyOrderHasTPayBillBase.select_ebuyOrderHasTPayBill",paramMap);
	}
	/**
	 * 按条件分页查询()信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<EbuyOrderHasTPayBill> selectEbuyOrderHasTPayBillByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectEbuyOrderHasTPayBillCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<EbuyOrderHasTPayBill> resMap= sqlSession.selectList("ebuyOrderHasTPayBillBase.select_ebuyOrderHasTPayBill_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询()信息
	 * @param id
	 * @return
	 */
	@Override
	public EbuyOrderHasTPayBill selectEbuyOrderHasTPayBillBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("ebuyOrderHasTPayBillBase.select_ebuyOrderHasTPayBill_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的()记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectEbuyOrderHasTPayBillCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("ebuyOrderHasTPayBillBase.select_ebuyOrderHasTPayBill_count", paramMap);
	}
	/**
	 * 往()新增一条记录
	 * @param ebuyOrderHasTPayBill
	 * @return
	 */
	@Override
	public int insertEbuyOrderHasTPayBill(EbuyOrderHasTPayBill ebuyOrderHasTPayBill){
		return sqlSession.insert("ebuyOrderHasTPayBillBase.insert_ebuyOrderHasTPayBill",ebuyOrderHasTPayBill);
	}
	/**
	 * 批量新增()信息
	 * @param ebuyOrderHasTPayBillList
	 * @return
	 */
	@Override
	public int insertEbuyOrderHasTPayBillBatch(List<EbuyOrderHasTPayBill> ebuyOrderHasTPayBillList) {
		return sqlSession.insert("ebuyOrderHasTPayBillBase.insert_ebuyOrderHasTPayBill_Batch",ebuyOrderHasTPayBillList);
	}
	
	/**
	 * 更新()信息
	 * @param ebuyOrderHasTPayBill
	 * @return
	 */
	@Override
	public int updateEbuyOrderHasTPayBill(EbuyOrderHasTPayBill ebuyOrderHasTPayBill){
		return sqlSession.update("ebuyOrderHasTPayBillBase.update_ebuyOrderHasTPayBill", ebuyOrderHasTPayBill);
	}
	/**
	 * 批量更新()信息
	 * @param ebuyOrderHasTPayBillList
	 * @return
	 */
	@Override
	public int updateEbuyOrderHasTPayBillBatch(List<EbuyOrderHasTPayBill> ebuyOrderHasTPayBillList) {
		return sqlSession.update("ebuyOrderHasTPayBillBase.update_ebuyOrderHasTPayBill_Batch", ebuyOrderHasTPayBillList);
	}
	
	/**
	 * 根据序列号删除()信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteEbuyOrderHasTPayBillLogic(java.math.BigInteger id){
		EbuyOrderHasTPayBill ebuyOrderHasTPayBill = new EbuyOrderHasTPayBill();
		ebuyOrderHasTPayBill.setId(id);
		ebuyOrderHasTPayBill.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("ebuyOrderHasTPayBillBase.delete_ebuyOrderHasTPayBill_Logic",ebuyOrderHasTPayBill);
	}
	
	/**
	 * 根据Id 批量删除()信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteEbuyOrderHasTPayBillLogicBatch(List<java.math.BigInteger> idList) {
		List<EbuyOrderHasTPayBill> delList = new java.util.ArrayList<EbuyOrderHasTPayBill>();
		for(java.math.BigInteger id:idList){
			EbuyOrderHasTPayBill ebuyOrderHasTPayBill = new EbuyOrderHasTPayBill();
			ebuyOrderHasTPayBill.setId(id);
			ebuyOrderHasTPayBill.setSys0DelState(RecordState_DELETED);
			delList.add(ebuyOrderHasTPayBill);
		}
		return sqlSession.update("ebuyOrderHasTPayBillBase.delete_ebuyOrderHasTPayBill_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除()信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteEbuyOrderHasTPayBill(java.math.BigInteger id){
//		return sqlSession.delete("ebuyOrderHasTPayBillBase.delete_ebuyOrderHasTPayBill", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除()信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteEbuyOrderHasTPayBillBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("ebuyOrderHasTPayBillBase.delete_ebuyOrderHasTPayBill_Batch", idList);
//	}
	
	
}
