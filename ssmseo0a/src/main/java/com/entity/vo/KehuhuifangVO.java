package com.entity.vo;

import com.entity.KehuhuifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 客户回访
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
public class KehuhuifangVO  implements Serializable {
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
	 * 回访内容
	 */
	
	private String huifangneirong;
		
	/**
	 * 存在问题
	 */
	
	private String cunzaiwenti;
		
	/**
	 * 客户意见
	 */
	
	private String kehuyijian;
		
	/**
	 * 客户建议
	 */
	
	private String kehujianyi;
		
	/**
	 * 回访时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huifangshijian;
		
	/**
	 * 客户评价
	 */
	
	private String kehupingjia;
		
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
	 * 设置：回访内容
	 */
	 
	public void setHuifangneirong(String huifangneirong) {
		this.huifangneirong = huifangneirong;
	}
	
	/**
	 * 获取：回访内容
	 */
	public String getHuifangneirong() {
		return huifangneirong;
	}
				
	
	/**
	 * 设置：存在问题
	 */
	 
	public void setCunzaiwenti(String cunzaiwenti) {
		this.cunzaiwenti = cunzaiwenti;
	}
	
	/**
	 * 获取：存在问题
	 */
	public String getCunzaiwenti() {
		return cunzaiwenti;
	}
				
	
	/**
	 * 设置：客户意见
	 */
	 
	public void setKehuyijian(String kehuyijian) {
		this.kehuyijian = kehuyijian;
	}
	
	/**
	 * 获取：客户意见
	 */
	public String getKehuyijian() {
		return kehuyijian;
	}
				
	
	/**
	 * 设置：客户建议
	 */
	 
	public void setKehujianyi(String kehujianyi) {
		this.kehujianyi = kehujianyi;
	}
	
	/**
	 * 获取：客户建议
	 */
	public String getKehujianyi() {
		return kehujianyi;
	}
				
	
	/**
	 * 设置：回访时间
	 */
	 
	public void setHuifangshijian(Date huifangshijian) {
		this.huifangshijian = huifangshijian;
	}
	
	/**
	 * 获取：回访时间
	 */
	public Date getHuifangshijian() {
		return huifangshijian;
	}
				
	
	/**
	 * 设置：客户评价
	 */
	 
	public void setKehupingjia(String kehupingjia) {
		this.kehupingjia = kehupingjia;
	}
	
	/**
	 * 获取：客户评价
	 */
	public String getKehupingjia() {
		return kehupingjia;
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
