package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwubiangengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwubiangengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwubiangengView;


/**
 * 服务变更
 *
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface FuwubiangengService extends IService<FuwubiangengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwubiangengVO> selectListVO(Wrapper<FuwubiangengEntity> wrapper);
   	
   	FuwubiangengVO selectVO(@Param("ew") Wrapper<FuwubiangengEntity> wrapper);
   	
   	List<FuwubiangengView> selectListView(Wrapper<FuwubiangengEntity> wrapper);
   	
   	FuwubiangengView selectView(@Param("ew") Wrapper<FuwubiangengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwubiangengEntity> wrapper);
   	
}

