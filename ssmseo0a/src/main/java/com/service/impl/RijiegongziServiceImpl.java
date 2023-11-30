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


import com.dao.RijiegongziDao;
import com.entity.RijiegongziEntity;
import com.service.RijiegongziService;
import com.entity.vo.RijiegongziVO;
import com.entity.view.RijiegongziView;

@Service("rijiegongziService")
public class RijiegongziServiceImpl extends ServiceImpl<RijiegongziDao, RijiegongziEntity> implements RijiegongziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RijiegongziEntity> page = this.selectPage(
                new Query<RijiegongziEntity>(params).getPage(),
                new EntityWrapper<RijiegongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RijiegongziEntity> wrapper) {
		  Page<RijiegongziView> page =new Query<RijiegongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RijiegongziVO> selectListVO(Wrapper<RijiegongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RijiegongziVO selectVO(Wrapper<RijiegongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RijiegongziView> selectListView(Wrapper<RijiegongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RijiegongziView selectView(Wrapper<RijiegongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
