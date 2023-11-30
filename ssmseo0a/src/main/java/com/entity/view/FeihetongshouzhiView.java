package com.entity.view;

import com.entity.FeihetongshouzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 非合同收支
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 12:57:43
 */
@TableName("feihetongshouzhi")
public class FeihetongshouzhiView  extends FeihetongshouzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeihetongshouzhiView(){
	}
 
 	public FeihetongshouzhiView(FeihetongshouzhiEntity feihetongshouzhiEntity){
 	try {
			BeanUtils.copyProperties(this, feihetongshouzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
