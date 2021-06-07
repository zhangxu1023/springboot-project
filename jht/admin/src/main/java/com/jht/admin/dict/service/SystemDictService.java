package com.jht.admin.dict.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.utils.PageUtils;

import java.util.Map;

/**
 * 系统字典
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-05-26 10:39:45
 */
public interface SystemDictService extends IService<SystemDict> {

    /**
     * 字典表页面显示替换
     * @param dictId
     * @return dictLabel
     */
    String getDictLabel(String dictId);

    /**
     * 字典表页面显示替换
     * @param systemDict
     * @param currPage
     * @param pageSize
     * @return pageList
     */
    PageUtils pageList(SystemDict systemDict, int currPage, int pageSize);
}

