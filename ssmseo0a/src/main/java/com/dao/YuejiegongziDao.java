package com.dao;

import com.entity.YuejiegongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuejiegongziVO;
import com.entity.view.YuejiegongziView;


/**
 * 月结工资
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface YuejiegongziDao extends BaseMapper<YuejiegongziEntity> {
	
	List<YuejiegongziVO> selectListVO(@Param("ew") Wrapper<YuejiegongziEntity> wrapper);
	
	YuejiegongziVO selectVO(@Param("ew") Wrapper<YuejiegongziEntity> wrapper);
	
	List<YuejiegongziView> selectListView(@Param("ew") Wrapper<YuejiegongziEntity> wrapper);

	List<YuejiegongziView> selectListView(Pagination page,@Param("ew") Wrapper<YuejiegongziEntity> wrapper);
	
	YuejiegongziView selectView(@Param("ew") Wrapper<YuejiegongziEntity> wrapper);
	
}
