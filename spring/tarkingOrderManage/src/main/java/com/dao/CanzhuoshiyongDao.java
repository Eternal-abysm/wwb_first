package com.dao;

import com.entity.CanzhuoshiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanzhuoshiyongVO;
import com.entity.view.CanzhuoshiyongView;


/**
 * 餐桌使用
 * 
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
public interface CanzhuoshiyongDao extends BaseMapper<CanzhuoshiyongEntity> {
	
	List<CanzhuoshiyongVO> selectListVO(@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);
	
	CanzhuoshiyongVO selectVO(@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);
	
	List<CanzhuoshiyongView> selectListView(@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);

	List<CanzhuoshiyongView> selectListView(Pagination page,@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);
	
	CanzhuoshiyongView selectView(@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);
	

}
