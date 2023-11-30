package com.dao;

import com.entity.FuwubiangengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwubiangengVO;
import com.entity.view.FuwubiangengView;


/**
 * 服务变更
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface FuwubiangengDao extends BaseMapper<FuwubiangengEntity> {
	
	List<FuwubiangengVO> selectListVO(@Param("ew") Wrapper<FuwubiangengEntity> wrapper);
	
	FuwubiangengVO selectVO(@Param("ew") Wrapper<FuwubiangengEntity> wrapper);
	
	List<FuwubiangengView> selectListView(@Param("ew") Wrapper<FuwubiangengEntity> wrapper);

	List<FuwubiangengView> selectListView(Pagination page,@Param("ew") Wrapper<FuwubiangengEntity> wrapper);
	
	FuwubiangengView selectView(@Param("ew") Wrapper<FuwubiangengEntity> wrapper);
	
}
