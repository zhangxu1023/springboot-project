package com.jht.admin.dict.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jht.admin.dict.dto.SystemDictInDTO;
import com.jht.admin.dict.dto.SystemDictOutDTO;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.admin.dict.service.SystemDictService;
import com.jht.common.biz.BaseBiz;
import com.jht.common.constant.BaseConstant;
import com.jht.common.exception.RRException;
import com.jht.common.mapper.BeanMapper;
import com.jht.common.utils.PageUtils;
import com.jht.common.web.HttpStatusEnum;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author admin
 */
@Component
public class SystemDictBizImpl extends BaseBiz implements SystemDictBiz {
    @Autowired
    private SystemDictService systemDictService;

    private static final Logger logger = LoggerFactory.getLogger(SystemDictBiz.class);

    @Override
    public List<SystemDict> list(SystemDict systemDict) {
        QueryWrapper<SystemDict> queryWrapper=  new QueryWrapper<>();
        if (systemDict != null){
            if (systemDict.getDictId() != null){
                queryWrapper.eq("dict_id",systemDict.getDictId());
            }
            if (StringUtils.isNotBlank(systemDict.getDictType())){
                queryWrapper.eq("dict_type",systemDict.getDictType());
            }
        }
        queryWrapper.orderByAsc("dict_sort");
        return systemDictService.list(queryWrapper);
    }

    @Override
    public PageUtils pageList(SystemDictInDTO inDTO) {
        SystemDict dict = BeanMapper.map(inDTO, SystemDict.class);
        PageUtils page = systemDictService.pageList(dict, inDTO.getCurrPage(), inDTO.getPageSize());
        List<SystemDict> list = (List<SystemDict>) page.getList();
        List<SystemDictOutDTO> resultList = transform(list, BaseConstant.SYSTEMDICTOUTDTO);
        page.setList(resultList);
        return page;
    }

    @Override
    public SystemDictOutDTO add(SystemDictInDTO inDTO) {
        SystemDictOutDTO outDTO = new SystemDictOutDTO();
        SystemDict dict = BeanMapper.map(inDTO, SystemDict.class);
        boolean result = systemDictService.save(dict);
        if(! result) {
            throw new RRException(HttpStatusEnum.INSERT_FAILURE.getEnMessage(),HttpStatusEnum.INSERT_FAILURE.value());
        }
        // 查询新增的记录
        QueryWrapper<SystemDict> queryWrapper=  new QueryWrapper<>();
        queryWrapper.eq("dict_value", dict.getDictValue());
        queryWrapper.orderByDesc("create_time");
        List<SystemDict> list = systemDictService.list(queryWrapper);
        outDTO.setDictId(String.valueOf(list.get(0).getDictId()));
        return outDTO;
    }

    @Override
    public SystemDictOutDTO update(SystemDictInDTO inDTO) {
        SystemDictOutDTO outDTO = new SystemDictOutDTO();
        SystemDict dict = BeanMapper.map(inDTO, SystemDict.class);
        UpdateWrapper<SystemDict> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("dict_id", dict.getDictId());
        boolean result = systemDictService.update(dict, updateWrapper);
        if(! result) {
            throw new RRException(HttpStatusEnum.UPDATE_FAILURE.getEnMessage(),HttpStatusEnum.UPDATE_FAILURE.value());
        }
        // 查询更新后的记录
        QueryWrapper<SystemDict> queryWrapper=  new QueryWrapper<>();
        queryWrapper.eq("dict_id", dict.getDictId());
        queryWrapper.orderByDesc("create_time");
        List<SystemDict> list = systemDictService.list(queryWrapper);
        if(!list.isEmpty()) {
            outDTO = BeanMapper.map(list.get(0), SystemDictOutDTO.class);
        }

        return outDTO;
    }
}
