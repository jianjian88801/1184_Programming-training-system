package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstikuziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstikuziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstikuziyuanView;


/**
 * 题库资源评论表
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface DiscusstikuziyuanService extends IService<DiscusstikuziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstikuziyuanVO> selectListVO(Wrapper<DiscusstikuziyuanEntity> wrapper);
   	
   	DiscusstikuziyuanVO selectVO(@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);
   	
   	List<DiscusstikuziyuanView> selectListView(Wrapper<DiscusstikuziyuanEntity> wrapper);
   	
   	DiscusstikuziyuanView selectView(@Param("ew") Wrapper<DiscusstikuziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstikuziyuanEntity> wrapper);
   	
}

