package com.entity.model;

import com.entity.CanzhuoshiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 餐桌使用
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
public class CanzhuoshiyongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐桌位置
	 */
	
	private String canzhuoweizhi;
		
	/**
	 * 可坐人数
	 */
	
	private Integer kezuorenshu;
		
	/**
	 * 使用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyongshijian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
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
	 * 设置：使用时间
	 */
	 
	public void setShiyongshijian(Date shiyongshijian) {
		this.shiyongshijian = shiyongshijian;
	}
	
	/**
	 * 获取：使用时间
	 */
	public Date getShiyongshijian() {
		return shiyongshijian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
			
}
