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


import com.dao.ShouzhizhengheDao;
import com.entity.ShouzhizhengheEntity;
import com.service.ShouzhizhengheService;
import com.entity.vo.ShouzhizhengheVO;
import com.entity.view.ShouzhizhengheView;

@Service("shouzhizhengheService")
public class ShouzhizhengheServiceImpl extends ServiceImpl<ShouzhizhengheDao, ShouzhizhengheEntity> implements ShouzhizhengheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouzhizhengheEntity> page = this.selectPage(
                new Query<ShouzhizhengheEntity>(params).getPage(),
                new EntityWrapper<ShouzhizhengheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouzhizhengheEntity> wrapper) {
		  Page<ShouzhizhengheView> page =new Query<ShouzhizhengheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouzhizhengheVO> selectListVO(Wrapper<ShouzhizhengheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouzhizhengheVO selectVO(Wrapper<ShouzhizhengheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouzhizhengheView> selectListView(Wrapper<ShouzhizhengheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouzhizhengheView selectView(Wrapper<ShouzhizhengheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
