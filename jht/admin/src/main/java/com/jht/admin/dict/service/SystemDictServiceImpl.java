package com.jht.admin.dict.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jht.admin.dict.dao.SystemDictDao;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.utils.PageUtils;
import com.jht.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * @author admin
 */
@Service
public class SystemDictServiceImpl extends ServiceImpl<SystemDictDao, SystemDict> implements SystemDictService {

    @Autowired
    private SystemDictDao systemDictDao;

    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SystemDict> page = this.page(
                new Query<SystemDict>().getPage(params),
                new QueryWrapper<SystemDict>()
        );

        return new PageUtils(page);
    }

}