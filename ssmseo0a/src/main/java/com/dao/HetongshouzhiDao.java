package com.dao;

import com.entity.HetongshouzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HetongshouzhiVO;
import com.entity.view.HetongshouzhiView;


/**
 * 合同收支
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface HetongshouzhiDao extends BaseMapper<HetongshouzhiEntity> {
	
	List<HetongshouzhiVO> selectListVO(@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);
	
	HetongshouzhiVO selectVO(@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);
	
	List<HetongshouzhiView> selectListView(@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);

	List<HetongshouzhiView> selectListView(Pagination page,@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);
	
	HetongshouzhiView selectView(@Param("ew") Wrapper<HetongshouzhiEntity> wrapper);
	
}
