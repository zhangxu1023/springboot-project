package com.jht.admin.dict.biz;

import com.jht.admin.dict.dto.SystemDictInDTO;
import com.jht.admin.dict.dto.SystemDictOutDTO;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

public interface SystemDictBiz {
    List<SystemDict> list(SystemDict systemDict);

    PageUtils pageList(SystemDictInDTO inDTO);

    SystemDictOutDTO add (SystemDictInDTO inDTO);
}
