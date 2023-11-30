package com.entity.model;

import com.entity.FeihetongshouzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 非合同收支
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public class FeihetongshouzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 财务账号
	 */
	
	private String caiwuzhanghao;
		
	/**
	 * 财务姓名
	 */
	
	private String caiwuxingming;
		
	/**
	 * 额度
	 */
	
	private String edu;
		
	/**
	 * 支付方式
	 */
	
	private String zhifufangshi;
		
	/**
	 * 支付时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhifushijian;
		
	/**
	 * 付款人
	 */
	
	private String fukuanren;
		
	/**
	 * 收款人
	 */
	
	private String shoukuanren;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
				
	
	/**
	 * 设置：额度
	 */
	 
	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	/**
	 * 获取：额度
	 */
	public String getEdu() {
		return edu;
	}
				
	
	/**
	 * 设置：支付方式
	 */
	 
	public void setZhifufangshi(String zhifufangshi) {
		this.zhifufangshi = zhifufangshi;
	}
	
	/**
	 * 获取：支付方式
	 */
	public String getZhifufangshi() {
		return zhifufangshi;
	}
				
	
	/**
	 * 设置：支付时间
	 */
	 
	public void setZhifushijian(Date zhifushijian) {
		this.zhifushijian = zhifushijian;
	}
	
	/**
	 * 获取：支付时间
	 */
	public Date getZhifushijian() {
		return zhifushijian;
	}
				
	
	/**
	 * 设置：付款人
	 */
	 
	public void setFukuanren(String fukuanren) {
		this.fukuanren = fukuanren;
	}
	
	/**
	 * 获取：付款人
	 */
	public String getFukuanren() {
		return fukuanren;
	}
				
	
	/**
	 * 设置：收款人
	 */
	 
	public void setShoukuanren(String shoukuanren) {
		this.shoukuanren = shoukuanren;
	}
	
	/**
	 * 获取：收款人
	 */
	public String getShoukuanren() {
		return shoukuanren;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
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
			
}
