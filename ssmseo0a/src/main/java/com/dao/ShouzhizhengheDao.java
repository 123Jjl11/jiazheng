package com.dao;

import com.entity.ShouzhizhengheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouzhizhengheVO;
import com.entity.view.ShouzhizhengheView;


/**
 * 收支整合
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface ShouzhizhengheDao extends BaseMapper<ShouzhizhengheEntity> {
	
	List<ShouzhizhengheVO> selectListVO(@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);
	
	ShouzhizhengheVO selectVO(@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);
	
	List<ShouzhizhengheView> selectListView(@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);

	List<ShouzhizhengheView> selectListView(Pagination page,@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);
	
	ShouzhizhengheView selectView(@Param("ew") Wrapper<ShouzhizhengheEntity> wrapper);
	
}
