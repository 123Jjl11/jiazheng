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


import com.dao.KehutousuDao;
import com.entity.KehutousuEntity;
import com.service.KehutousuService;
import com.entity.vo.KehutousuVO;
import com.entity.view.KehutousuView;

@Service("kehutousuService")
public class KehutousuServiceImpl extends ServiceImpl<KehutousuDao, KehutousuEntity> implements KehutousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehutousuEntity> page = this.selectPage(
                new Query<KehutousuEntity>(params).getPage(),
                new EntityWrapper<KehutousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehutousuEntity> wrapper) {
		  Page<KehutousuView> page =new Query<KehutousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehutousuVO> selectListVO(Wrapper<KehutousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehutousuVO selectVO(Wrapper<KehutousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehutousuView> selectListView(Wrapper<KehutousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehutousuView selectView(Wrapper<KehutousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
