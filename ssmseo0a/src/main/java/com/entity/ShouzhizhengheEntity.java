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
 * 收支整合
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
@TableName("shouzhizhenghe")
public class ShouzhizhengheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouzhizhengheEntity() {
		
	}
	
	public ShouzhizhengheEntity(T t) {
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
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 合同收支
	 */
					
	private String hetongshouzhi;
	
	/**
	 * 非合同收支
	 */
					
	private String feihetongshouzhi;
	
	/**
	 * 金额
	 */
					
	private String jine;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 财务账号
	 */
					
	private String caiwuzhanghao;
	
	/**
	 * 财务姓名
	 */
					
	private String caiwuxingming;
	
	
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
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：合同收支
	 */
	public void setHetongshouzhi(String hetongshouzhi) {
		this.hetongshouzhi = hetongshouzhi;
	}
	/**
	 * 获取：合同收支
	 */
	public String getHetongshouzhi() {
		return hetongshouzhi;
	}
	/**
	 * 设置：非合同收支
	 */
	public void setFeihetongshouzhi(String feihetongshouzhi) {
		this.feihetongshouzhi = feihetongshouzhi;
	}
	/**
	 * 获取：非合同收支
	 */
	public String getFeihetongshouzhi() {
		return feihetongshouzhi;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(String jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public String getJine() {
		return jine;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
	/**
	 * 设置：财务账号
	 */
	public void setCaiwuzhanghao(String caiwuzhanghao) {
		this.caiwuzhanghao = caiwuzhanghao;
	}
	/**
	 * 获取：财务账号
	 */
	public String getCaiwuzhanghao() {
		return caiwuzhanghao;
	}
	/**
	 * 设置：财务姓名
	 */
	public void setCaiwuxingming(String caiwuxingming) {
		this.caiwuxingming = caiwuxingming;
	}
	/**
	 * 获取：财务姓名
	 */
	public String getCaiwuxingming() {
		return caiwuxingming;
	}

}
