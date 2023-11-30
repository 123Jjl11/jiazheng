package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeihetongshouzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeihetongshouzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeihetongshouzhiView;


/**
 * 非合同收支
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface FeihetongshouzhiService extends IService<FeihetongshouzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeihetongshouzhiVO> selectListVO(Wrapper<FeihetongshouzhiEntity> wrapper);
   	
   	FeihetongshouzhiVO selectVO(@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);
   	
   	List<FeihetongshouzhiView> selectListView(Wrapper<FeihetongshouzhiEntity> wrapper);
   	
   	FeihetongshouzhiView selectView(@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeihetongshouzhiEntity> wrapper);
   	
}

