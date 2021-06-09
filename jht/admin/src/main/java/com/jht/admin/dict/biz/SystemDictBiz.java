package com.jht.admin.dict.biz;

import com.jht.admin.dict.dto.SystemDictInDTO;
import com.jht.admin.dict.dto.SystemDictOutDTO;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

/**
 * @author admin
 */
public interface SystemDictBiz {
    /**
     * 列表检索
     * @param systemDict
     * @return
     */
    List<SystemDict> list(SystemDict systemDict);

    /**
     * 分页列表检索
     * @param inDTO
     * @return
     */
    PageUtils pageList(SystemDictInDTO inDTO);

    /**
     * 新增记录
     * @param inDTO
     * @return
     */
    SystemDictOutDTO add (SystemDictInDTO inDTO);

    /**
     * 更新记录
     * @param inDTO
     * @return
     */
    SystemDictOutDTO update (SystemDictInDTO inDTO);
}
