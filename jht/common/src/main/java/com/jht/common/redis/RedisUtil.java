package com.jht.common.redis;

import com.jht.common.core.entity.UserToken;
import com.jht.common.constant.BaseConstant;
import com.jht.common.jwt.JWT;
import com.jht.common.utils.VerifyUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class RedisUtil {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    // =============================common============================

    /**
     * 指定缓存失效时间
     *
     * @param key  键
     * @param time 时间(秒)
     * @return
     */
    public boolean expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据key 获取过期时间
     *
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     *
     * @param key 键
     * @return true 存在 false不存在
     */
    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除缓存
     *
     * @param key 可以传一个值 或多个
     */
    @SuppressWarnings("unchecked")
    public void delete(String... key) {
        if (key != null && key.length > 0) {
            if (key.length == 1) {
                redisTemplate.delete(key[0]);
            } else {
                redisTemplate.delete((Collection<String>) CollectionUtils.arrayToList(key));
            }
        }
    }

    // ============================String=============================

    /**
     * 普通缓存获取
     *
     * @param key 键
     * @return 值
     */
    public Object get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * 普通缓存放入
     *
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     */
    public boolean set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 普通缓存放入并设置时间
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    public boolean set(String key, Object value, long time) {
        try {
            if (time > 0) {
                redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            } else {
                set(key, value);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 递增
     *
     * @param key   键
     * @param delta 要增加几(大于0)
     * @return long
     */
    public long increment(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /**
     * 递减
     *
     * @param key   键
     * @param delta 要减少几(小于0)
     * @return long
     */
    public long decrement(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递减因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, -delta);
    }

    // ================================Map=================================

    /**
     * HashGet
     *
     * @param key  键 不能为null
     * @param item 项 不能为null
     * @return 值
     */
    public Object hashGet(String key, String item) {
        return redisTemplate.opsForHash().get(key, item);
    }

    /**
     * 获取hashKey对应的所有键值
     *
     * @param key 键
     * @return 对应的多个键值
     */
    public Map<Object, Object> hashGetAll(String key) {
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * HashSet
     *
     * @param key 键
     * @param map 对应多个键值
     * @return true 成功 false 失败
     */
    public boolean hashSetAll(String key, Map<String, Object> map) {
        try {
            redisTemplate.opsForHash().putAll(key, map);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * HashSet 并设置时间
     *
     * @param key  键
     * @param map  对应多个键值
     * @param time 时间(秒)
     * @return true成功 false失败
     */
    public boolean hashSetAll(String key, Map<String, Object> map, long time) {
        try {
            redisTemplate.opsForHash().putAll(key, map);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 向一张hash表中放入数据,如果不存在将创建
     *
     * @param key   键
     * @param item  项
     * @param value 值
     * @return true 成功 false失败
     */
    public boolean hashSet(String key, String item, Object value) {
        try {
            redisTemplate.opsForHash().put(key, item, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 向一张hash表中放入数据,如果不存在将创建
     *
     * @param key   键
     * @param item  项
     * @param value 值
     * @param time  时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间
     * @return true 成功 false失败
     */
    public boolean hashGet(String key, String item, Object value, long time) {
        try {
            redisTemplate.opsForHash().put(key, item, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除hash表中的值
     *
     * @param key  键 不能为null
     * @param item 项 可以使多个 不能为null
     */
    public void hashDelete(String key, Object... item) {
        redisTemplate.opsForHash().delete(key, item);
    }

    /**
     * 判断hash表中是否有该项的值
     *
     * @param key  键 不能为null
     * @param item 项 不能为null
     * @return true 存在 false不存在
     */
    public boolean hasHashKey(String key, String item) {
        return redisTemplate.opsForHash().hasKey(key, item);
    }

    /**
     * hash递增 如果不存在,就会创建一个 并把新增后的值返回
     *
     * @param key  键
     * @param item 项
     * @param by   要增加几(大于0)
     * @return double
     */
    public double hashIncrement(String key, String item, double by) {
        return redisTemplate.opsForHash().increment(key, item, by);
    }

    /**
     * hash递减
     *
     * @param key  键
     * @param item 项
     * @param by   要减少记(小于0)
     * @return double
     */
    public double hashDecrement(String key, String item, double by) {
        return redisTemplate.opsForHash().increment(key, item, -by);
    }

    // ============================set=============================

    /**
     * 根据key获取Set中的所有值
     *
     * @param key 键
     * @return Set<Object>
     */
    public Set<Object> setMembers(String key) {
        try {
            return redisTemplate.opsForSet().members(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据value从一个set中查询,是否存在
     *
     * @param key   键
     * @param value 值
     * @return true 存在 false不存在
     */
    public boolean setIsMember(String key, Object value) {
        try {
            return redisTemplate.opsForSet().isMember(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将数据放入set缓存
     *
     * @param key    键
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long setAdd(String key, Object... values) {
        try {
            return redisTemplate.opsForSet().add(key, values);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 将set数据放入缓存
     *
     * @param key    键
     * @param time   时间(秒)
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long setAdd(String key, long time, Object... values) {
        try {
            Long count = redisTemplate.opsForSet().add(key, values);
            if (time > 0) {
                expire(key, time);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 获取set缓存的长度
     *
     * @param key 键
     * @return long
     */
    public long setSize(String key) {
        try {
            return redisTemplate.opsForSet().size(key);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 移除值为value的
     *
     * @param key    键
     * @param values 值 可以是多个
     * @return 移除的个数
     */
    public long setRemove(String key, Object... values) {
        try {
            return redisTemplate.opsForSet().remove(key, values);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // ===============================list=================================

    /**
     * 获取list缓存的内容
     *
     * @param key   键
     * @param start 开始
     * @param end   结束 0 到 -1代表所有值
     * @return List<Object>
     */
    public List<Object> listGet(String key, long start, long end) {
        try {
            return redisTemplate.opsForList().range(key, start, end);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取list缓存的长度
     *
     * @param key 键
     * @return long
     */
    public long listGetSize(String key) {
        try {
            return redisTemplate.opsForList().size(key);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 通过索引 获取list中的值
     *
     * @param key   键
     * @param index 索引 index&gt;=0时， 0 表头，1 第二个元素，依次类推；index&lt;0时，-1，表尾，-2倒数第二个元素，依次类推
     * @return Object
     */
    public Object listGetIndex(String key, long index) {
        try {
            return redisTemplate.opsForList().index(key, index);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @return true 成功 false 不成功
     */
    public boolean listSet(String key, Object value) {
        try {
            redisTemplate.opsForList().rightPush(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒)
     * @return true 成功 false 不成功
     */
    public boolean listSet(String key, Object value, long time) {
        try {
            redisTemplate.opsForList().rightPush(key, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @return true 成功 false 不成功
     */
    public boolean listSet(String key, List<Object> value) {
        try {
            redisTemplate.opsForList().rightPushAll(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒)
     * @return true 成功 false 不成功
     */
    public boolean listSet(String key, List<Object> value, long time) {
        try {
            redisTemplate.opsForList().rightPushAll(key, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据索引修改list中的某条数据
     *
     * @param key   键
     * @param index 索引
     * @param value 值
     * @return true 成功 false 不成功
     */
    public boolean listUpdateByIndex(String key, long index, Object value) {
        try {
            redisTemplate.opsForList().set(key, index, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 移除N个值为value
     *
     * @param key   键
     * @param count 移除多少个
     * @param value 值
     * @return 移除的个数
     */
    public long listRemove(String key, long count, Object value) {
        try {
            return redisTemplate.opsForList().remove(key, count, value);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * @param key
     * @param value
     * @param code
     * @return
     * @Description 保存到redis
     * @author Alvis
     * @date 2017年12月18日 下午5:05:36
     */
    public boolean saveRedis(String key, String value, String code) {
        boolean flag = true;
        switch (code) {
            case BaseConstant.REDIS_PHONE:
                stringRedisTemplate.opsForValue().set(key, value, 15, TimeUnit.MINUTES);
                break;
            case BaseConstant.REDIS_MAIL:
                stringRedisTemplate.opsForValue().set(key, value, 30, TimeUnit.MINUTES);
                break;
            case BaseConstant.REDIS_TOKEN:
                stringRedisTemplate.opsForValue().set(key, value, 60 * 3, TimeUnit.MINUTES);
                break;
            case BaseConstant.REDIS_VERIFICATION_CODE:
                stringRedisTemplate.opsForValue().set(key, value, 5, TimeUnit.MINUTES);
                break;
            default:
                flag = false;
                break;
        }

        return flag;
    }

    /**
     * @param key
     * @param obj
     * @Description 保存token信息和权限信息
     * @author Alvis
     * @date 2018年1月10日 下午2:34:30
     */
    public void saveRedis(String key, UserToken obj) {
        redisTemplate.opsForValue().set(key, obj, 60 * 3, TimeUnit.MINUTES);
        log.info("有效期10800秒");
    }

    // APPV3.4 --开始

    /**
     * @param key
     * @param obj
     * @Description 保存token信息和权限信息，APP用，有效期7天
     * @author Alvis
     * @date 2018年1月10日 下午2:34:30
     */
    public void saveRedisForApp(String key, UserToken obj) {
        redisTemplate.opsForValue().set(key, obj, 60 * 24 * 7, TimeUnit.MINUTES);
        log.info("有效期604800秒");
    }

    // APPV3.4 --结束

    /**
     * @Description 通用保存
     * @author Alvis
     * @date 2018年1月11日 下午4:43:39
     */
    public void saveRedis(String key, Map<?, ?> map) {
        redisTemplate.opsForValue().set(key, map);
    }

    /**
     * @param key
     * @param value
     * @return
     * @Description 验证
     * @author Alvis
     * @date 2017年12月18日 下午5:05:47
     */
    public boolean verifyRedisAndDelete(String key, String value) {
        boolean flag = false;
        String verify = stringRedisTemplate.opsForValue().get(key);
        if (null != verify && value.equals(verify)) {
            flag = true;
            stringRedisTemplate.delete(key);
        }

        return flag;
    }

    public boolean verifyRedis(String key, String value) {
        boolean flag = false;
        String verify = stringRedisTemplate.opsForValue().get(key);
        if (null != verify && value.equals(verify)) {
            flag = true;
        }

        return flag;
    }

    /**
     * @param token
     * @return
     * @Description token验证
     * @author Alvis
     * @date 2017年12月18日 下午5:21:20
     */
    public boolean verifyTokenRedis(String token, HttpServletRequest request) {
        boolean flag = false;

        UserToken user = JWT.unsign(token, UserToken.class);

        if (null == user || null == user.getId()) {
            return flag;
        }

        // APP V3.4 --开始
        // 从header部获取user-agent
        String deviceFlag = request.getHeader("device-flag");
//		String userAgent2 = request.getHeader("user-agent");
        log.info("RedisUtils.verifyTokenRedis获取的device-flag:" + deviceFlag);
//		logger.info("RedisUtils.verifyTokenRedis获取的user-agent:" + userAgent2);
        // 判断是否为APP端登录
        Boolean isApp = VerifyUtils.isLoginByApp(deviceFlag);
        log.info("RedisUtils.verifyTokenRedis的isApp:" + isApp);
        // APP V3.4 --结束

        // 前端未开发，暂时关闭权限验证功能，前端开发完开启此功能,此功能需要改进
        /*
         * UserToken ut = (UserToken)
         * redisTemplate.opsForValue().get(user.getType()+Long.toString(user.getId()));
         * if (null!=ut && null != ut.getToken() && ut.getToken().equals(token)) {
         * String url = request.getServletPath(); List<String> list = ut.getUrl(); if
         * (null==list || list.isEmpty()) { return flag; }
         *
         * for (String string : list) { if (string.equals(url)) { flag = true;
         * saveRedis(BaseConstant.REDIS_PRE_MANAGER_KEY + Long.toString(user.getId()),
         * ut); break; } } }
         */
        UserToken ut = (UserToken) redisTemplate.opsForValue().get(user.getType() + Long.toString(user.getId()));
        if (null != ut && null != ut.getToken() && ut.getToken().equals(token)) {
            String url = request.getServletPath();
            request.setAttribute(BaseConstant.LOGINPERSONID, user.getId());
            request.setAttribute(BaseConstant.LOGIN_PERSON_TYPE, ut.getType());
            log.info(BaseConstant.LOGINPERSONID + user.getId());
            log.info(url);
            // APP V3.4 --开始
            // 由于APP调用接口的header尚未100%传device-flag，APP V3.5暂时使用现存Redis的前缀分辨是否为APP
            if (StringUtils.equals(BaseConstant.REDIS_PRE_USER_APP_KEY, ut.getType())) {
                this.saveRedisForApp(user.getType() + Long.toString(user.getId()), ut);
            } else {
                saveRedis(user.getType() + Long.toString(user.getId()), ut);
            }
            // APP V3.4 --结束

//			saveRedis(user.getType() + Long.toString(user.getId()), ut);
            flag = true;
        }

        return flag;
    }

    /**
     * @return
     * @Description 通过管道保存到redis
     * @author Alvis
     * @date 2018年1月3日 下午4:40:27
     */
    public void savePipelingRedis(final Map<String, Object> map) {
        redisTemplate.executePipelined(new RedisCallback<Object>() {
            @SuppressWarnings("unchecked")
            @Override
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer valueSerializer = redisTemplate.getValueSerializer();
                RedisSerializer keySerializer = redisTemplate.getKeySerializer();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    connection.set(keySerializer.serialize(entry.getKey()),
                            valueSerializer.serialize(entry.getValue()));
                }
                return null;
            }
        });
    }

    /**
     * @param key
     * @Description 物理删除某个key
     * @author Alvis
     * @date 2018年5月8日 上午8:59:06
     */
    public void deleteKey(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 在redis中验证验证码
     *
     * @param verificationCodeToken redis验证码key
     * @param verificationCode      用户输入的验证码
     * @return boolean
     * @author lichanghong
     * @date 2020年11月16日 14:50
     */
    public boolean verifyVerificationCode(String verificationCodeToken, String verificationCode) {
        boolean flag = false;
        String redisVerificationCode = stringRedisTemplate.opsForValue().get(verificationCodeToken);
        if (redisVerificationCode != null && redisVerificationCode.equalsIgnoreCase(verificationCode)) {
            flag = true;
            // 由于前端在发送手机短信验证码时还需要判断验证码,所以暂时不删除,待后续优化再调整
            // stringRedisTemplate.delete(verificationCodeToken);
        }
        return flag;
    }
}

