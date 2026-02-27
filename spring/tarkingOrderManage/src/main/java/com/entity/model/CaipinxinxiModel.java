package com.entity.model;

import com.entity.CaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 菜品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
public class CaipinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 菜品类型
	 */
	
	private String caipinleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 口味
	 */
	
	private String kouwei;
		
	/**
	 * 预计时间
	 */
	
	private String yujishijian;
		
	/**
	 * 菜品介绍
	 */
	
	private String caipinjieshao;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：菜品类型
	 */
	 
	public void setCaipinleixing(String caipinleixing) {
		this.caipinleixing = caipinleixing;
	}
	
	/**
	 * 获取：菜品类型
	 */
	public String getCaipinleixing() {
		return caipinleixing;
	}
				
	
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
	 * 设置：口味
	 */
	 
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
				
	
	/**
	 * 设置：预计时间
	 */
	 
	public void setYujishijian(String yujishijian) {
		this.yujishijian = yujishijian;
	}
	
	/**
	 * 获取：预计时间
	 */
	public String getYujishijian() {
		return yujishijian;
	}
				
	
	/**
	 * 设置：菜品介绍
	 */
	 
	public void setCaipinjieshao(String caipinjieshao) {
		this.caipinjieshao = caipinjieshao;
	}
	
	/**
	 * 获取：菜品介绍
	 */
	public String getCaipinjieshao() {
		return caipinjieshao;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
