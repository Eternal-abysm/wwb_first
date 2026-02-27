package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 餐桌使用
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
@TableName("canzhuoshiyong")
public class CanzhuoshiyongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanzhuoshiyongEntity() {
		
	}
	
	public CanzhuoshiyongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 餐桌号码
	 */
					
	private String canzhuohaoma;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：餐桌号码
	 */
	public void setCanzhuohaoma(String canzhuohaoma) {
		this.canzhuohaoma = canzhuohaoma;
	}
	/**
	 * 获取：餐桌号码
	 */
	public String getCanzhuohaoma() {
		return canzhuohaoma;
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
