package com.jht.admin.dict.dao;

import com.jht.admin.dict.entity.SystemDict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统字典
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-05-26 10:39:45
 */
@Mapper
public interface SystemDictDao extends BaseMapper<SystemDict> {
	
}
