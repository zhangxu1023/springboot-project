package com.jht.admin.dict.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.admin.dict.service.SystemDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author admin
 */
@Component
public class SystemDictBizImpl implements SystemDictBiz {
    @Autowired
    private SystemDictService systemDictService;

    @Override
    public List<SystemDict> list(SystemDict systemDict) {
        QueryWrapper<SystemDict> queryWrapper=  new QueryWrapper<>();
        if (systemDict != null){
            if (systemDict.getDictId() != null){
                queryWrapper.eq("dict_id",systemDict.getDictId());
            }
            if (systemDict.getDictType() != null){
                queryWrapper.eq("dict_type",systemDict.getDictType());
            }
        }
        queryWrapper.orderByAsc("dict_sort");
        return systemDictService.list(queryWrapper);
    }
}
