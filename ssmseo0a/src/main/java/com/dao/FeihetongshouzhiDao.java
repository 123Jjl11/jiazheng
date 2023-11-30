package com.dao;

import com.entity.FeihetongshouzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeihetongshouzhiVO;
import com.entity.view.FeihetongshouzhiView;


/**
 * 非合同收支
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface FeihetongshouzhiDao extends BaseMapper<FeihetongshouzhiEntity> {
	
	List<FeihetongshouzhiVO> selectListVO(@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);
	
	FeihetongshouzhiVO selectVO(@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);
	
	List<FeihetongshouzhiView> selectListView(@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);

	List<FeihetongshouzhiView> selectListView(Pagination page,@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);
	
	FeihetongshouzhiView selectView(@Param("ew") Wrapper<FeihetongshouzhiEntity> wrapper);
	
}
