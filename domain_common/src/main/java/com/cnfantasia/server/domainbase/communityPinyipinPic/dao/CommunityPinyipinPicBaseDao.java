package com.cnfantasia.server.domainbase.communityPinyipinPic.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.communityPinyipinPic.entity.CommunityPinyipinPic;

/**
 * 描述:(拼一拼图片列表) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class CommunityPinyipinPicBaseDao extends AbstractBaseDao implements ICommunityPinyipinPicBaseDao{
	/**
	 * 根据条件查询(拼一拼图片列表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<CommunityPinyipinPic> selectCommunityPinyipinPicByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("communityPinyipinPicBase.select_communityPinyipinPic",paramMap);
	}
	/**
	 * 按条件分页查询(拼一拼图片列表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<CommunityPinyipinPic> selectCommunityPinyipinPicByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectCommunityPinyipinPicCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<CommunityPinyipinPic> resMap= sqlSession.selectList("communityPinyipinPicBase.select_communityPinyipinPic_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(拼一拼图片列表)信息
	 * @param id
	 * @return
	 */
	@Override
	public CommunityPinyipinPic selectCommunityPinyipinPicBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("communityPinyipinPicBase.select_communityPinyipinPic_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(拼一拼图片列表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectCommunityPinyipinPicCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("communityPinyipinPicBase.select_communityPinyipinPic_count", paramMap);
	}
	/**
	 * 往(拼一拼图片列表)新增一条记录
	 * @param communityPinyipinPic
	 * @return
	 */
	@Override
	public int insertCommunityPinyipinPic(CommunityPinyipinPic communityPinyipinPic){
		return sqlSession.insert("communityPinyipinPicBase.insert_communityPinyipinPic",communityPinyipinPic);
	}
	/**
	 * 批量新增(拼一拼图片列表)信息
	 * @param communityPinyipinPicList
	 * @return
	 */
	@Override
	public int insertCommunityPinyipinPicBatch(List<CommunityPinyipinPic> communityPinyipinPicList) {
		return sqlSession.insert("communityPinyipinPicBase.insert_communityPinyipinPic_Batch",communityPinyipinPicList);
	}
	
	/**
	 * 更新(拼一拼图片列表)信息
	 * @param communityPinyipinPic
	 * @return
	 */
	@Override
	public int updateCommunityPinyipinPic(CommunityPinyipinPic communityPinyipinPic){
		return sqlSession.update("communityPinyipinPicBase.update_communityPinyipinPic", communityPinyipinPic);
	}
	/**
	 * 批量更新(拼一拼图片列表)信息
	 * @param communityPinyipinPicList
	 * @return
	 */
	@Override
	public int updateCommunityPinyipinPicBatch(List<CommunityPinyipinPic> communityPinyipinPicList) {
		return sqlSession.update("communityPinyipinPicBase.update_communityPinyipinPic_Batch", communityPinyipinPicList);
	}
	
	/**
	 * 根据序列号删除(拼一拼图片列表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteCommunityPinyipinPicLogic(java.math.BigInteger id){
		CommunityPinyipinPic communityPinyipinPic = new CommunityPinyipinPic();
		communityPinyipinPic.setId(id);
		communityPinyipinPic.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("communityPinyipinPicBase.delete_communityPinyipinPic_Logic",communityPinyipinPic);
	}
	
	/**
	 * 根据Id 批量删除(拼一拼图片列表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteCommunityPinyipinPicLogicBatch(List<java.math.BigInteger> idList) {
		List<CommunityPinyipinPic> delList = new java.util.ArrayList<CommunityPinyipinPic>();
		for(java.math.BigInteger id:idList){
			CommunityPinyipinPic communityPinyipinPic = new CommunityPinyipinPic();
			communityPinyipinPic.setId(id);
			communityPinyipinPic.setSys0DelState(RecordState_DELETED);
			delList.add(communityPinyipinPic);
		}
		return sqlSession.update("communityPinyipinPicBase.delete_communityPinyipinPic_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(拼一拼图片列表)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteCommunityPinyipinPic(java.math.BigInteger id){
//		return sqlSession.delete("communityPinyipinPicBase.delete_communityPinyipinPic", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(拼一拼图片列表)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteCommunityPinyipinPicBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("communityPinyipinPicBase.delete_communityPinyipinPic_Batch", idList);
//	}
	
	
}
