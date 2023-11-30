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


import com.dao.YuejiegongziDao;
import com.entity.YuejiegongziEntity;
import com.service.YuejiegongziService;
import com.entity.vo.YuejiegongziVO;
import com.entity.view.YuejiegongziView;

@Service("yuejiegongziService")
public class YuejiegongziServiceImpl extends ServiceImpl<YuejiegongziDao, YuejiegongziEntity> implements YuejiegongziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuejiegongziEntity> page = this.selectPage(
                new Query<YuejiegongziEntity>(params).getPage(),
                new EntityWrapper<YuejiegongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuejiegongziEntity> wrapper) {
		  Page<YuejiegongziView> page =new Query<YuejiegongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuejiegongziVO> selectListVO(Wrapper<YuejiegongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuejiegongziVO selectVO(Wrapper<YuejiegongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuejiegongziView> selectListView(Wrapper<YuejiegongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuejiegongziView selectView(Wrapper<YuejiegongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
