package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiantitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiantitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiantitongjiView;


/**
 * 练题统计
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface LiantitongjiService extends IService<LiantitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiantitongjiVO> selectListVO(Wrapper<LiantitongjiEntity> wrapper);
   	
   	LiantitongjiVO selectVO(@Param("ew") Wrapper<LiantitongjiEntity> wrapper);
   	
   	List<LiantitongjiView> selectListView(Wrapper<LiantitongjiEntity> wrapper);
   	
   	LiantitongjiView selectView(@Param("ew") Wrapper<LiantitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiantitongjiEntity> wrapper);
   	
}

