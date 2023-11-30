package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RijiegongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RijiegongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RijiegongziView;


/**
 * 日结工资
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface RijiegongziService extends IService<RijiegongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RijiegongziVO> selectListVO(Wrapper<RijiegongziEntity> wrapper);
   	
   	RijiegongziVO selectVO(@Param("ew") Wrapper<RijiegongziEntity> wrapper);
   	
   	List<RijiegongziView> selectListView(Wrapper<RijiegongziEntity> wrapper);
   	
   	RijiegongziView selectView(@Param("ew") Wrapper<RijiegongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RijiegongziEntity> wrapper);
   	
}

