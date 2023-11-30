package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HetongshouzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HetongshouzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HetongshouzhiView;


/**
 * 合同收支
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface HetongshouzhiService extends IService<HetongshouzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HetongshouzhiVO> selectListVO(Wrapper<HetongshouzhiEntity> wrapper);
   	
   	HetongshouzhiVO selectVO(@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);
   	
   	List<HetongshouzhiView> selectListView(Wrapper<HetongshouzhiEntity> wrapper);
   	
   	HetongshouzhiView selectView(@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HetongshouzhiEntity> wrapper);
   	
}

