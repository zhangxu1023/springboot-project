package com.jht.admin.dict.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jht.admin.dict.dto.SystemDictInDTO;
import com.jht.admin.dict.dto.SystemDictOutDTO;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.admin.dict.service.SystemDictService;
import com.jht.common.biz.BaseBiz;
import com.jht.common.constant.BaseConstant;
import com.jht.common.mapper.BeanMapper;
import com.jht.common.utils.PageUtils;
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
            if (systemDict.getDictType() != null){
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
}
