package com.jht.admin.dict.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jht.admin.dict.dao.SystemDictDao;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.constant.BaseConstant;
import com.jht.common.constant.BaseReidsConstant;
import com.jht.common.utils.PageUtils;
import com.jht.common.utils.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author admin
 */
@Service
public class SystemDictServiceImpl extends ServiceImpl<SystemDictDao, SystemDict> implements SystemDictService {

    @Autowired
    private SystemDictDao systemDictDao;

    @Autowired
    private StringRedisTemplate redisStringTemplate;

    @Override
    public String getDictLabel(String dictId) {
        if(StringUtils.isBlank(dictId) || StringUtils.equals(BaseConstant.STR_NULL,dictId)) {
            return StringUtils.EMPTY;
        }

        String name = (String) redisStringTemplate.opsForHash().get(BaseReidsConstant.DICT_REDIS,dictId);

        if(StringUtils.isBlank(name)) {
            // 从DB的系统字典表查询
            QueryWrapper<SystemDict> queryWrapper=  new QueryWrapper<>();
            queryWrapper.eq("dict_id",Long.parseLong(dictId));
            List<SystemDict> list = systemDictDao.selectList(queryWrapper);
            if(list.size() == 1) {
                redisStringTemplate.opsForHash().put(BaseReidsConstant.DICT_REDIS, dictId, list.get(0).getDictLabel());
                return list.get(0).getDictLabel();
            }
            return StringUtils.EMPTY;
        }
        return name;
    }

    @Override
    public PageUtils pageList(SystemDict systemDict, int currPage, int pageSize) {
        Map<String, Object> params = new HashMap<>();
        params.put("currPage", currPage);
        params.put("pageSize", pageSize);
        QueryWrapper<SystemDict> queryWrapper=  new QueryWrapper<>();
        if (systemDict != null){
            if (systemDict.getDictId() != null){
                queryWrapper.eq("dict_id",systemDict.getDictId());
            }
            if (StringUtils.isNotBlank(systemDict.getDictType())){
                queryWrapper.eq("dict_type",systemDict.getDictType());
            }
            if (StringUtils.isNotBlank(systemDict.getDescription())){
                queryWrapper.like("description",systemDict.getDescription());
            }
        }

        IPage<SystemDict> page = this.page(
                new Query<SystemDict>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

}