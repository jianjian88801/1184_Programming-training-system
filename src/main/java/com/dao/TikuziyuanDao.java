package com.dao;

import com.entity.TikuziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TikuziyuanVO;
import com.entity.view.TikuziyuanView;


/**
 * 题库资源
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface TikuziyuanDao extends BaseMapper<TikuziyuanEntity> {
	
	List<TikuziyuanVO> selectListVO(@Param("ew") Wrapper<TikuziyuanEntity> wrapper);
	
	TikuziyuanVO selectVO(@Param("ew") Wrapper<TikuziyuanEntity> wrapper);
	
	List<TikuziyuanView> selectListView(@Param("ew") Wrapper<TikuziyuanEntity> wrapper);

	List<TikuziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<TikuziyuanEntity> wrapper);
	
	TikuziyuanView selectView(@Param("ew") Wrapper<TikuziyuanEntity> wrapper);
	
}
