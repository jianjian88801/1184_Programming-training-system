package com.dao;

import com.entity.DiscusstikuziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstikuziyuanVO;
import com.entity.view.DiscusstikuziyuanView;


/**
 * 题库资源评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface DiscusstikuziyuanDao extends BaseMapper<DiscusstikuziyuanEntity> {
	
	List<DiscusstikuziyuanVO> selectListVO(@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);
	
	DiscusstikuziyuanVO selectVO(@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);
	
	List<DiscusstikuziyuanView> selectListView(@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);

	List<DiscusstikuziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);
	
	DiscusstikuziyuanView selectView(@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);
	
}
