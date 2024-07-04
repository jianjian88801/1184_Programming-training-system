package com.dao;

import com.entity.LiantitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiantitongjiVO;
import com.entity.view.LiantitongjiView;


/**
 * 练题统计
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface LiantitongjiDao extends BaseMapper<LiantitongjiEntity> {
	
	List<LiantitongjiVO> selectListVO(@Param("ew") Wrapper<LiantitongjiEntity> wrapper);
	
	LiantitongjiVO selectVO(@Param("ew") Wrapper<LiantitongjiEntity> wrapper);
	
	List<LiantitongjiView> selectListView(@Param("ew") Wrapper<LiantitongjiEntity> wrapper);

	List<LiantitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<LiantitongjiEntity> wrapper);
	
	LiantitongjiView selectView(@Param("ew") Wrapper<LiantitongjiEntity> wrapper);
	
}
