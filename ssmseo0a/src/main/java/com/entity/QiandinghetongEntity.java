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
 * 签订合同
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
@TableName("qiandinghetong")
public class QiandinghetongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiandinghetongEntity() {
		
	}
	
	public QiandinghetongEntity(T t) {
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
	 * 合同编号
	 */
					
	private String hetongbianhao;
	
	/**
	 * 客户账号
	 */
					
	private String kehuzhanghao;
	
	/**
	 * 客户姓名
	 */
					
	private String kehuxingming;
	
	/**
	 * 合同内容
	 */
					
	private String hetongneirong;
	
	/**
	 * 服务内容
	 */
					
	private String fuwuneirong;
	
	/**
	 * 服务地点
	 */
					
	private String fuwudidian;
	
	/**
	 * 起始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qishishijian;
	
	/**
	 * 结束时间
	 */
					
	private String jieshushijian;
	
	/**
	 * 工作小时
	 */
					
	private Integer gongzuoxiaoshi;
	
	/**
	 * 工作天数
	 */
					
	private Integer gongzuotianshu;
	
	/**
	 * 试用期
	 */
					
	private String shiyongqi;
	
	/**
	 * 工资
	 */
					
	private Integer gongzi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 前台账号
	 */
					
	private String qiantaizhanghao;
	
	/**
	 * 前台姓名
	 */
					
	private String qiantaixingming;
	
	
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
	 * 设置：合同编号
	 */
	public void setHetongbianhao(String hetongbianhao) {
		this.hetongbianhao = hetongbianhao;
	}
	/**
	 * 获取：合同编号
	 */
	public String getHetongbianhao() {
		return hetongbianhao;
	}
	/**
	 * 设置：客户账号
	 */
	public void setKehuzhanghao(String kehuzhanghao) {
		this.kehuzhanghao = kehuzhanghao;
	}
	/**
	 * 获取：客户账号
	 */
	public String getKehuzhanghao() {
		return kehuzhanghao;
	}
	/**
	 * 设置：客户姓名
	 */
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
	/**
	 * 设置：合同内容
	 */
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
	/**
	 * 设置：服务内容
	 */
	public void setFuwuneirong(String fuwuneirong) {
		this.fuwuneirong = fuwuneirong;
	}
	/**
	 * 获取：服务内容
	 */
	public String getFuwuneirong() {
		return fuwuneirong;
	}
	/**
	 * 设置：服务地点
	 */
	public void setFuwudidian(String fuwudidian) {
		this.fuwudidian = fuwudidian;
	}
	/**
	 * 获取：服务地点
	 */
	public String getFuwudidian() {
		return fuwudidian;
	}
	/**
	 * 设置：起始时间
	 */
	public void setQishishijian(Date qishishijian) {
		this.qishishijian = qishishijian;
	}
	/**
	 * 获取：起始时间
	 */
	public Date getQishishijian() {
		return qishishijian;
	}
	/**
	 * 设置：结束时间
	 */
	public void setJieshushijian(String jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	/**
	 * 获取：结束时间
	 */
	public String getJieshushijian() {
		return jieshushijian;
	}
	/**
	 * 设置：工作小时
	 */
	public void setGongzuoxiaoshi(Integer gongzuoxiaoshi) {
		this.gongzuoxiaoshi = gongzuoxiaoshi;
	}
	/**
	 * 获取：工作小时
	 */
	public Integer getGongzuoxiaoshi() {
		return gongzuoxiaoshi;
	}
	/**
	 * 设置：工作天数
	 */
	public void setGongzuotianshu(Integer gongzuotianshu) {
		this.gongzuotianshu = gongzuotianshu;
	}
	/**
	 * 获取：工作天数
	 */
	public Integer getGongzuotianshu() {
		return gongzuotianshu;
	}
	/**
	 * 设置：试用期
	 */
	public void setShiyongqi(String shiyongqi) {
		this.shiyongqi = shiyongqi;
	}
	/**
	 * 获取：试用期
	 */
	public String getShiyongqi() {
		return shiyongqi;
	}
	/**
	 * 设置：工资
	 */
	public void setGongzi(Integer gongzi) {
		this.gongzi = gongzi;
	}
	/**
	 * 获取：工资
	 */
	public Integer getGongzi() {
		return gongzi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：前台账号
	 */
	public void setQiantaizhanghao(String qiantaizhanghao) {
		this.qiantaizhanghao = qiantaizhanghao;
	}
	/**
	 * 获取：前台账号
	 */
	public String getQiantaizhanghao() {
		return qiantaizhanghao;
	}
	/**
	 * 设置：前台姓名
	 */
	public void setQiantaixingming(String qiantaixingming) {
		this.qiantaixingming = qiantaixingming;
	}
	/**
	 * 获取：前台姓名
	 */
	public String getQiantaixingming() {
		return qiantaixingming;
	}

}
