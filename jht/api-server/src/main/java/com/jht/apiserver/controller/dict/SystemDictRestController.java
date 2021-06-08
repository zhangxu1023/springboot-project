package com.jht.apiserver.controller.dict;

import java.util.List;

import com.jht.admin.dict.biz.SystemDictBiz;
import com.jht.admin.dict.dto.SystemDictInDTO;
import com.jht.admin.dict.dto.SystemDictOutDTO;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.constant.BaseConstant;
import com.jht.common.exception.RRException;
import com.jht.common.utils.PageUtils;
import com.jht.common.utils.R;
import com.jht.common.web.HttpStatusEnum;
import com.jht.common.web.MediaTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


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

    /**
     * 新增记录
     */
    @RequestMapping(value = "/add", method = {RequestMethod.POST}, consumes = {MediaTypes.JSON}, produces = MediaTypes.JSON_UTF_8)
    public R add(@RequestBody SystemDictInDTO inDTO, HttpServletRequest request){
        Object id = request.getAttribute(BaseConstant.LOGINPERSONID);
        SystemDictOutDTO outDTO = new SystemDictOutDTO();
        try {
            if(id == null) {
                logger.info("没有Token");
                return R.error(HttpStatusEnum.INTERNAL_SERVER_ERROR.value(),
                        HttpStatusEnum.INTERNAL_SERVER_ERROR.getCnMessage());
            }
            outDTO = systemDictBiz.add(inDTO);
        } catch (RRException e) {
            logger.error("新增系统字典表异常信息为:", e);
            return R.error(e.getCode(), e.getMsg());
        } catch (Exception e) {
            logger.error("新增系统字典表异常信息为:", e);
            return R.error(HttpStatusEnum.INTERNAL_SERVER_ERROR.value(),
                    HttpStatusEnum.INTERNAL_SERVER_ERROR.getEnMessage());
        }

        return R.ok().put("dictId", outDTO.getDictId());
    }




}
