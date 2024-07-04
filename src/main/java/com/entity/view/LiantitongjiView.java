package com.entity.view;

import com.entity.LiantitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 练题统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
@TableName("liantitongji")
public class LiantitongjiView  extends LiantitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiantitongjiView(){
	}
 
 	public LiantitongjiView(LiantitongjiEntity liantitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, liantitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
