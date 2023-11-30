package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouzhizhengheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouzhizhengheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouzhizhengheView;


/**
 * 收支整合
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface ShouzhizhengheService extends IService<ShouzhizhengheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouzhizhengheVO> selectListVO(Wrapper<ShouzhizhengheEntity> wrapper);
   	
   	ShouzhizhengheVO selectVO(@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);
   	
   	List<ShouzhizhengheView> selectListView(Wrapper<ShouzhizhengheEntity> wrapper);
   	
   	ShouzhizhengheView selectView(@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouzhizhengheEntity> wrapper);
   	
}

