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


import com.dao.FuwubiangengDao;
import com.entity.FuwubiangengEntity;
import com.service.FuwubiangengService;
import com.entity.vo.FuwubiangengVO;
import com.entity.view.FuwubiangengView;

@Service("fuwubiangengService")
public class FuwubiangengServiceImpl extends ServiceImpl<FuwubiangengDao, FuwubiangengEntity> implements FuwubiangengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwubiangengEntity> page = this.selectPage(
                new Query<FuwubiangengEntity>(params).getPage(),
                new EntityWrapper<FuwubiangengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwubiangengEntity> wrapper) {
		  Page<FuwubiangengView> page =new Query<FuwubiangengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwubiangengVO> selectListVO(Wrapper<FuwubiangengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwubiangengVO selectVO(Wrapper<FuwubiangengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwubiangengView> selectListView(Wrapper<FuwubiangengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwubiangengView selectView(Wrapper<FuwubiangengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
