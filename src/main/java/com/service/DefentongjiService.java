package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DefentongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DefentongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DefentongjiView;


/**
 * 得分统计
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public interface DefentongjiService extends IService<DefentongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DefentongjiVO> selectListVO(Wrapper<DefentongjiEntity> wrapper);
   	
   	DefentongjiVO selectVO(@Param("ew") Wrapper<DefentongjiEntity> wrapper);
   	
   	List<DefentongjiView> selectListView(Wrapper<DefentongjiEntity> wrapper);
   	
   	DefentongjiView selectView(@Param("ew") Wrapper<DefentongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DefentongjiEntity> wrapper);
   	
}

