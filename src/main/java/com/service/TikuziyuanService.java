package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TikuziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TikuziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TikuziyuanView;


/**
 * 题库资源
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface TikuziyuanService extends IService<TikuziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TikuziyuanVO> selectListVO(Wrapper<TikuziyuanEntity> wrapper);
   	
   	TikuziyuanVO selectVO(@Param("ew") Wrapper<TikuziyuanEntity> wrapper);
   	
   	List<TikuziyuanView> selectListView(Wrapper<TikuziyuanEntity> wrapper);
   	
   	TikuziyuanView selectView(@Param("ew") Wrapper<TikuziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TikuziyuanEntity> wrapper);
   	
}

