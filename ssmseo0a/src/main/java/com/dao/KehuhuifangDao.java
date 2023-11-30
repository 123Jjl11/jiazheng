package com.dao;

import com.entity.KehuhuifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehuhuifangVO;
import com.entity.view.KehuhuifangView;


/**
 * 客户回访
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface KehuhuifangDao extends BaseMapper<KehuhuifangEntity> {
	
	List<KehuhuifangVO> selectListVO(@Param("ew") Wrapper<KehuhuifangEntity> wrapper);
	
	KehuhuifangVO selectVO(@Param("ew") Wrapper<KehuhuifangEntity> wrapper);
	
	List<KehuhuifangView> selectListView(@Param("ew") Wrapper<KehuhuifangEntity> wrapper);

	List<KehuhuifangView> selectListView(Pagination page,@Param("ew") Wrapper<KehuhuifangEntity> wrapper);
	
	KehuhuifangView selectView(@Param("ew") Wrapper<KehuhuifangEntity> wrapper);
	
}
