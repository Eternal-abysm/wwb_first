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


import com.dao.CanzhuoshiyongDao;
import com.entity.CanzhuoshiyongEntity;
import com.service.CanzhuoshiyongService;
import com.entity.vo.CanzhuoshiyongVO;
import com.entity.view.CanzhuoshiyongView;

@Service("canzhuoshiyongService")
public class CanzhuoshiyongServiceImpl extends ServiceImpl<CanzhuoshiyongDao, CanzhuoshiyongEntity> implements CanzhuoshiyongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanzhuoshiyongEntity> page = this.selectPage(
                new Query<CanzhuoshiyongEntity>(params).getPage(),
                new EntityWrapper<CanzhuoshiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanzhuoshiyongEntity> wrapper) {
		  Page<CanzhuoshiyongView> page =new Query<CanzhuoshiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanzhuoshiyongVO> selectListVO(Wrapper<CanzhuoshiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanzhuoshiyongVO selectVO(Wrapper<CanzhuoshiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanzhuoshiyongView> selectListView(Wrapper<CanzhuoshiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanzhuoshiyongView selectView(Wrapper<CanzhuoshiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
