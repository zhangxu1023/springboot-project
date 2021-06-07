package com.jht.apiserver.controller.dict;

import java.util.List;

import com.jht.admin.dict.biz.SystemDictBiz;
import com.jht.admin.dict.dto.SystemDictInDTO;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.utils.PageUtils;
import com.jht.common.utils.R;
import com.jht.common.web.MediaTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 系统字典
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-05-26 10:39:45
 */
@RestController
@RequestMapping(value = {"${version}/systemdict"})
public class SystemDictRestController {
    @Autowired
    private SystemDictBiz systemDictBiz;

    private static final Logger logger = LoggerFactory.getLogger(SystemDictRestController.class);

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = {RequestMethod.POST}, consumes = {MediaTypes.JSON}, produces = MediaTypes.JSON_UTF_8)
    public R list(@RequestBody SystemDict systemDict){
        List<SystemDict> data = systemDictBiz.list(systemDict);

        return R.ok().put("list", data);
    }

    /**
     * 分页列表
     */
    @RequestMapping(value = "/pagelist", method = {RequestMethod.POST}, consumes = {MediaTypes.JSON}, produces = MediaTypes.JSON_UTF_8)
    public R pageList(@RequestBody SystemDictInDTO inDTO){
        PageUtils page = systemDictBiz.pageList(inDTO);

        return R.ok().put("page", page);
    }




}
