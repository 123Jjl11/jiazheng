package com.dao;

import com.entity.KehutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehutousuVO;
import com.entity.view.KehutousuView;


/**
 * 客户投诉
 * 
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public interface KehutousuDao extends BaseMapper<KehutousuEntity> {
	
	List<KehutousuVO> selectListVO(@Param("ew") Wrapper<KehutousuEntity> wrapper);
	
	KehutousuVO selectVO(@Param("ew") Wrapper<KehutousuEntity> wrapper);
	
	List<KehutousuView> selectListView(@Param("ew") Wrapper<KehutousuEntity> wrapper);

	List<KehutousuView> selectListView(Pagination page,@Param("ew") Wrapper<KehutousuEntity> wrapper);
	
	KehutousuView selectView(@Param("ew") Wrapper<KehutousuEntity> wrapper);
	
}
