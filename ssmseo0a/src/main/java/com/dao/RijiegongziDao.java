package com.dao;

import com.entity.RijiegongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RijiegongziVO;
import com.entity.view.RijiegongziView;


/**
 * 日结工资
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface RijiegongziDao extends BaseMapper<RijiegongziEntity> {
	
	List<RijiegongziVO> selectListVO(@Param("ew") Wrapper<RijiegongziEntity> wrapper);
	
	RijiegongziVO selectVO(@Param("ew") Wrapper<RijiegongziEntity> wrapper);
	
	List<RijiegongziView> selectListView(@Param("ew") Wrapper<RijiegongziEntity> wrapper);

	List<RijiegongziView> selectListView(Pagination page,@Param("ew") Wrapper<RijiegongziEntity> wrapper);
	
	RijiegongziView selectView(@Param("ew") Wrapper<RijiegongziEntity> wrapper);
	
}
