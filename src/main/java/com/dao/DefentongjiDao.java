package com.dao;

import com.entity.DefentongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DefentongjiVO;
import com.entity.view.DefentongjiView;


/**
 * 得分统计
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface DefentongjiDao extends BaseMapper<DefentongjiEntity> {
	
	List<DefentongjiVO> selectListVO(@Param("ew") Wrapper<DefentongjiEntity> wrapper);
	
	DefentongjiVO selectVO(@Param("ew") Wrapper<DefentongjiEntity> wrapper);
	
	List<DefentongjiView> selectListView(@Param("ew") Wrapper<DefentongjiEntity> wrapper);

	List<DefentongjiView> selectListView(Pagination page,@Param("ew") Wrapper<DefentongjiEntity> wrapper);
	
	DefentongjiView selectView(@Param("ew") Wrapper<DefentongjiEntity> wrapper);
	
}
