package com.dao;

import com.entity.QiandinghetongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandinghetongVO;
import com.entity.view.QiandinghetongView;


/**
 * 签订合同
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface QiandinghetongDao extends BaseMapper<QiandinghetongEntity> {
	
	List<QiandinghetongVO> selectListVO(@Param("ew") Wrapper<QiandinghetongEntity> wrapper);
	
	QiandinghetongVO selectVO(@Param("ew") Wrapper<QiandinghetongEntity> wrapper);
	
	List<QiandinghetongView> selectListView(@Param("ew") Wrapper<QiandinghetongEntity> wrapper);

	List<QiandinghetongView> selectListView(Pagination page,@Param("ew") Wrapper<QiandinghetongEntity> wrapper);
	
	QiandinghetongView selectView(@Param("ew") Wrapper<QiandinghetongEntity> wrapper);
	
}
