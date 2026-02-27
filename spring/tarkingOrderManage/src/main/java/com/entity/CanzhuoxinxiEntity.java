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
 * 餐桌信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-08 14:11:54
 */
@TableName("canzhuoxinxi")
public class CanzhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanzhuoxinxiEntity() {
		
	}
	
	public CanzhuoxinxiEntity(T t) {
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
