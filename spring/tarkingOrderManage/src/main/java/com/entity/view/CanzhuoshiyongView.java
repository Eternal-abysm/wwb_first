package com.entity.view;

import com.entity.CanzhuoshiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐桌使用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
@TableName("canzhuoshiyong")
public class CanzhuoshiyongView  extends CanzhuoshiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanzhuoshiyongView(){
	}
 
 	public CanzhuoshiyongView(CanzhuoshiyongEntity canzhuoshiyongEntity){
 	try {
			BeanUtils.copyProperties(this, canzhuoshiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
