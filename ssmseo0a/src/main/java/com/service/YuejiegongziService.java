package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuejiegongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuejiegongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuejiegongziView;


/**
 * 月结工资
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface YuejiegongziService extends IService<YuejiegongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuejiegongziVO> selectListVO(Wrapper<YuejiegongziEntity> wrapper);
   	
   	YuejiegongziVO selectVO(@Param("ew") Wrapper<YuejiegongziEntity> wrapper);
   	
   	List<YuejiegongziView> selectListView(Wrapper<YuejiegongziEntity> wrapper);
   	
   	YuejiegongziView selectView(@Param("ew") Wrapper<YuejiegongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuejiegongziEntity> wrapper);
   	
}

