package com.entity.view;

import com.entity.CaiwurenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 财务人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
@TableName("caiwurenyuan")
public class CaiwurenyuanView  extends CaiwurenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaiwurenyuanView(){
	}
 
 	public CaiwurenyuanView(CaiwurenyuanEntity caiwurenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, caiwurenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
