package com.jht.common.biz;

import com.jht.common.mapper.BeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BaseBiz {
    public static Logger logger = LoggerFactory.getLogger(BaseBiz.class);

    /**
     * @Description 把实体list对象转换成 传输层list对象 ,注意：如果实体和dto字段不一致将舍弃该字段
     * @param list
     * @param className dto全路径
     * @return
     * @author Alvis
     * @date 2017年11月2日 下午4:01:28
     */
    @SuppressWarnings(value={"unchecked", "rawtypes"})
    public List transform(List<?> list, String className) {
        List resultList = new ArrayList();
        try {
            Class CClass = Class.forName(className);
            for (Object u : list) {
                if(null == u) {
                    continue;
                }
                Object obj = BeanMapper.map(u, CClass);
                resultList.add(obj);
            }
        } catch (ClassNotFoundException e) {
            logger.error("error in {},errorMessage {dto创建失败}", this.getClass(), e.getMessage());
            e.printStackTrace();
        }

        return resultList;
    }
}
