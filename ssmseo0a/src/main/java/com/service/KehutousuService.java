package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehutousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehutousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehutousuView;


/**
 * 客户投诉
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface KehutousuService extends IService<KehutousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehutousuVO> selectListVO(Wrapper<KehutousuEntity> wrapper);
   	
   	KehutousuVO selectVO(@Param("ew") Wrapper<KehutousuEntity> wrapper);
   	
   	List<KehutousuView> selectListView(Wrapper<KehutousuEntity> wrapper);
   	
   	KehutousuView selectView(@Param("ew") Wrapper<KehutousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehutousuEntity> wrapper);
   	
}

