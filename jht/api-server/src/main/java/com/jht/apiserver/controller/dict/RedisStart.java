package com.jht.apiserver.controller.dict;

import com.jht.admin.dict.biz.SystemDictBiz;
import com.jht.admin.dict.entity.SystemDict;
import com.jht.common.constant.BaseReidsConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author admin
 */
@RestController
public class RedisStart {
    public static Logger logger = LoggerFactory.getLogger(RedisStart.class);
//    @Autowired
//    private SystemDictBiz systemDictBiz;
    @Autowired
    private StringRedisTemplate redisStringTemplate;

    @PostConstruct
    public void redisDictStart(){
        logger.info("Loading data dictionary start");

//        List<SystemDict> list = systemDictBiz.list(new SystemDict());
//        Map<String, String> map = list.stream().collect(Collectors.toMap(y->y.getDictId().toString(), x -> x.getDictLabel()));
//
//        redisStringTemplate.delete(BaseReidsConstant.DICT_REDIS);
//        redisStringTemplate.opsForHash().putAll(BaseReidsConstant.DICT_REDIS, map);

        // 设定、读取测试代码 --开始
        Map<String,String> testMap = new HashMap<String, String>();
        testMap.put("991","测试值991");
        testMap.put("992","测试值992");
        redisStringTemplate.delete("test1");
        redisStringTemplate.delete("user32");
        // 放一个Map
        redisStringTemplate.opsForHash().putAll("test1",testMap);
        // 放一个value
        redisStringTemplate.opsForValue().set("user32","测试token");
        String name = (String) redisStringTemplate.opsForHash().get("test1","991");
        logger.info(name);

        String token = (String) redisStringTemplate.opsForValue().get("user32");
        logger.info(token);
        // 设定、读取测试代码 --结束


        logger.info("Load data dictionary end");
    }
}
