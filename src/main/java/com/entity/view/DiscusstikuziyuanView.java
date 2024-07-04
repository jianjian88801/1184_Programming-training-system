package com.entity.view;

import com.entity.DiscusstikuziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 题库资源评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
@TableName("discusstikuziyuan")
public class DiscusstikuziyuanView  extends DiscusstikuziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstikuziyuanView(){
	}
 
 	public DiscusstikuziyuanView(DiscusstikuziyuanEntity discusstikuziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discusstikuziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
