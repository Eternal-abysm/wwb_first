package com.entity.vo;

import com.entity.CanzhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 餐桌信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
public class CanzhuoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 可坐人数
	 */
	
	private Integer kezuorenshu;
		
	/**
	 * 餐桌位置
	 */
	
	private String canzhuoweizhi;
		
	/**
	 * 餐桌状态
	 */
	
	private String canzhuozhuangtai;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：可坐人数
	 */
	 
	public void setKezuorenshu(Integer kezuorenshu) {
		this.kezuorenshu = kezuorenshu;
	}
	
	/**
	 * 获取：可坐人数
	 */
	public Integer getKezuorenshu() {
		return kezuorenshu;
	}
				
	
	/**
	 * 设置：餐桌位置
	 */
	 
	public void setCanzhuoweizhi(String canzhuoweizhi) {
		this.canzhuoweizhi = canzhuoweizhi;
	}
	
	/**
	 * 获取：餐桌位置
	 */
	public String getCanzhuoweizhi() {
		return canzhuoweizhi;
	}
				
	
	/**
	 * 设置：餐桌状态
	 */
	 
	public void setCanzhuozhuangtai(String canzhuozhuangtai) {
		this.canzhuozhuangtai = canzhuozhuangtai;
	}
	
	/**
	 * 获取：餐桌状态
	 */
	public String getCanzhuozhuangtai() {
		return canzhuozhuangtai;
	}
			
}
