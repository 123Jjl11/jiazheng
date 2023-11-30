package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KehuhuifangDao;
import com.entity.KehuhuifangEntity;
import com.service.KehuhuifangService;
import com.entity.vo.KehuhuifangVO;
import com.entity.view.KehuhuifangView;

@Service("kehuhuifangService")
public class KehuhuifangServiceImpl extends ServiceImpl<KehuhuifangDao, KehuhuifangEntity> implements KehuhuifangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehuhuifangEntity> page = this.selectPage(
                new Query<KehuhuifangEntity>(params).getPage(),
                new EntityWrapper<KehuhuifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehuhuifangEntity> wrapper) {
		  Page<KehuhuifangView> page =new Query<KehuhuifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehuhuifangVO> selectListVO(Wrapper<KehuhuifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehuhuifangVO selectVO(Wrapper<KehuhuifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehuhuifangView> selectListView(Wrapper<KehuhuifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehuhuifangView selectView(Wrapper<KehuhuifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
