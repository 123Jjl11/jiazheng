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
 * 月结工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
@TableName("yuejiegongzi")
public class YuejiegongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuejiegongziEntity() {
		
	}
	
	public YuejiegongziEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 劳动收入
	 */
					
	private Integer laodongshouru;
	
	/**
	 * 其他补助
	 */
					
	private Integer qitabuzhu;
	
	/**
	 * 绩效奖金
	 */
					
	private Integer jixiaojiangjin;
	
	/**
	 * 扣款金额
	 */
					
	private Integer koukuanjine;
	
	/**
	 * 扣款原因
	 */
					
	private String koukuanyuanyin;
	
	/**
	 * 实发工资
	 */
					
	private String shifagongzi;
	
	/**
	 * 发放时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fafangshijian;
	
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
	 * 设置：员工工号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
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
	 * 设置：劳动收入
	 */
	public void setLaodongshouru(Integer laodongshouru) {
		this.laodongshouru = laodongshouru;
	}
	/**
	 * 获取：劳动收入
	 */
	public Integer getLaodongshouru() {
		return laodongshouru;
	}
	/**
	 * 设置：其他补助
	 */
	public void setQitabuzhu(Integer qitabuzhu) {
		this.qitabuzhu = qitabuzhu;
	}
	/**
	 * 获取：其他补助
	 */
	public Integer getQitabuzhu() {
		return qitabuzhu;
	}
	/**
	 * 设置：绩效奖金
	 */
	public void setJixiaojiangjin(Integer jixiaojiangjin) {
		this.jixiaojiangjin = jixiaojiangjin;
	}
	/**
	 * 获取：绩效奖金
	 */
	public Integer getJixiaojiangjin() {
		return jixiaojiangjin;
	}
	/**
	 * 设置：扣款金额
	 */
	public void setKoukuanjine(Integer koukuanjine) {
		this.koukuanjine = koukuanjine;
	}
	/**
	 * 获取：扣款金额
	 */
	public Integer getKoukuanjine() {
		return koukuanjine;
	}
	/**
	 * 设置：扣款原因
	 */
	public void setKoukuanyuanyin(String koukuanyuanyin) {
		this.koukuanyuanyin = koukuanyuanyin;
	}
	/**
	 * 获取：扣款原因
	 */
	public String getKoukuanyuanyin() {
		return koukuanyuanyin;
	}
	/**
	 * 设置：实发工资
	 */
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
	}
	/**
	 * 设置：发放时间
	 */
	public void setFafangshijian(Date fafangshijian) {
		this.fafangshijian = fafangshijian;
	}
	/**
	 * 获取：发放时间
	 */
	public Date getFafangshijian() {
		return fafangshijian;
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
