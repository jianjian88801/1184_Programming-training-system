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
 * 得分统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
@TableName("defentongji")
public class DefentongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DefentongjiEntity() {
		
	}
	
	public DefentongjiEntity(T t) {
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
	 * 统计编号
	 */
					
	private String tongjibianhao;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 试卷题目
	 */
					
	private String shijuantimu;
	
	/**
	 * 得分
	 */
					
	private Float defen;
	
	/**
	 * 得分分析
	 */
					
	private String defenfenxi;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	
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
	 * 设置：统计编号
	 */
	public void setTongjibianhao(String tongjibianhao) {
		this.tongjibianhao = tongjibianhao;
	}
	/**
	 * 获取：统计编号
	 */
	public String getTongjibianhao() {
		return tongjibianhao;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：试卷题目
	 */
	public void setShijuantimu(String shijuantimu) {
		this.shijuantimu = shijuantimu;
	}
	/**
	 * 获取：试卷题目
	 */
	public String getShijuantimu() {
		return shijuantimu;
	}
	/**
	 * 设置：得分
	 */
	public void setDefen(Float defen) {
		this.defen = defen;
	}
	/**
	 * 获取：得分
	 */
	public Float getDefen() {
		return defen;
	}
	/**
	 * 设置：得分分析
	 */
	public void setDefenfenxi(String defenfenxi) {
		this.defenfenxi = defenfenxi;
	}
	/**
	 * 获取：得分分析
	 */
	public String getDefenfenxi() {
		return defenfenxi;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}

}
