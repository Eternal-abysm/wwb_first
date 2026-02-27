package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanzhuoshiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanzhuoshiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanzhuoshiyongView;


/**
 * 餐桌使用
 *
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
public interface CanzhuoshiyongService extends IService<CanzhuoshiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanzhuoshiyongVO> selectListVO(Wrapper<CanzhuoshiyongEntity> wrapper);
   	
   	CanzhuoshiyongVO selectVO(@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);
   	
   	List<CanzhuoshiyongView> selectListView(Wrapper<CanzhuoshiyongEntity> wrapper);
   	
   	CanzhuoshiyongView selectView(@Param("ew") Wrapper<CanzhuoshiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanzhuoshiyongEntity> wrapper);
   	

}

