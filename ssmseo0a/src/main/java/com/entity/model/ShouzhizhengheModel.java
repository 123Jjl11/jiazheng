package com.entity.model;

import com.entity.ShouzhizhengheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 收支整合
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public class ShouzhizhengheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
