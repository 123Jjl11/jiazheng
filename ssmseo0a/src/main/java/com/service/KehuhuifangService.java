package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehuhuifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehuhuifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehuhuifangView;


/**
 * 客户回访
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface KehuhuifangService extends IService<KehuhuifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehuhuifangVO> selectListVO(Wrapper<KehuhuifangEntity> wrapper);
   	
   	KehuhuifangVO selectVO(@Param("ew") Wrapper<KehuhuifangEntity> wrapper);
   	
   	List<KehuhuifangView> selectListView(Wrapper<KehuhuifangEntity> wrapper);
   	
   	KehuhuifangView selectView(@Param("ew") Wrapper<KehuhuifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehuhuifangEntity> wrapper);
   	
}

