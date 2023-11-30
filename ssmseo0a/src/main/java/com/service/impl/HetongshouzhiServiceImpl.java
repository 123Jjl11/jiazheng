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


import com.dao.HetongshouzhiDao;
import com.entity.HetongshouzhiEntity;
import com.service.HetongshouzhiService;
import com.entity.vo.HetongshouzhiVO;
import com.entity.view.HetongshouzhiView;

@Service("hetongshouzhiService")
public class HetongshouzhiServiceImpl extends ServiceImpl<HetongshouzhiDao, HetongshouzhiEntity> implements HetongshouzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HetongshouzhiEntity> page = this.selectPage(
                new Query<HetongshouzhiEntity>(params).getPage(),
                new EntityWrapper<HetongshouzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HetongshouzhiEntity> wrapper) {
		  Page<HetongshouzhiView> page =new Query<HetongshouzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HetongshouzhiVO> selectListVO(Wrapper<HetongshouzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HetongshouzhiVO selectVO(Wrapper<HetongshouzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HetongshouzhiView> selectListView(Wrapper<HetongshouzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HetongshouzhiView selectView(Wrapper<HetongshouzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
