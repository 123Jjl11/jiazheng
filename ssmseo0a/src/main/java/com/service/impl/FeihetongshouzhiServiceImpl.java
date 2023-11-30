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


import com.dao.FeihetongshouzhiDao;
import com.entity.FeihetongshouzhiEntity;
import com.service.FeihetongshouzhiService;
import com.entity.vo.FeihetongshouzhiVO;
import com.entity.view.FeihetongshouzhiView;

@Service("feihetongshouzhiService")
public class FeihetongshouzhiServiceImpl extends ServiceImpl<FeihetongshouzhiDao, FeihetongshouzhiEntity> implements FeihetongshouzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeihetongshouzhiEntity> page = this.selectPage(
                new Query<FeihetongshouzhiEntity>(params).getPage(),
                new EntityWrapper<FeihetongshouzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeihetongshouzhiEntity> wrapper) {
		  Page<FeihetongshouzhiView> page =new Query<FeihetongshouzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeihetongshouzhiVO> selectListVO(Wrapper<FeihetongshouzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeihetongshouzhiVO selectVO(Wrapper<FeihetongshouzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeihetongshouzhiView> selectListView(Wrapper<FeihetongshouzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeihetongshouzhiView selectView(Wrapper<FeihetongshouzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
