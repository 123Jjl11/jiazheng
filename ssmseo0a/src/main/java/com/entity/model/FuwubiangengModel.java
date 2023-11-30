package com.entity.model;

import com.entity.FuwubiangengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 服务变更
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public class FuwubiangengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户账号
	 */
	
	private String kehuzhanghao;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 原项目
	 */
	
	private String yuanxiangmu;
		
	/**
	 * 新项目
	 */
	
	private String xinxiangmu;
		
	/**
	 * 变更日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biangengriqi;
		
	/**
	 * 变更原因
	 */
	
	private String biangengyuanyin;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：原项目
	 */
	 
	public void setYuanxiangmu(String yuanxiangmu) {
		this.yuanxiangmu = yuanxiangmu;
	}
	
	/**
	 * 获取：原项目
	 */
	public String getYuanxiangmu() {
		return yuanxiangmu;
	}
				
	
	/**
	 * 设置：新项目
	 */
	 
	public void setXinxiangmu(String xinxiangmu) {
		this.xinxiangmu = xinxiangmu;
	}
	
	/**
	 * 获取：新项目
	 */
	public String getXinxiangmu() {
		return xinxiangmu;
	}
				
	
	/**
	 * 设置：变更日期
	 */
	 
	public void setBiangengriqi(Date biangengriqi) {
		this.biangengriqi = biangengriqi;
	}
	
	/**
	 * 获取：变更日期
	 */
	public Date getBiangengriqi() {
		return biangengriqi;
	}
				
	
	/**
	 * 设置：变更原因
	 */
	 
	public void setBiangengyuanyin(String biangengyuanyin) {
		this.biangengyuanyin = biangengyuanyin;
	}
	
	/**
	 * 获取：变更原因
	 */
	public String getBiangengyuanyin() {
		return biangengyuanyin;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
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
			
}
