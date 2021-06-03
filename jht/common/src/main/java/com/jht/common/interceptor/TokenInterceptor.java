package com.jht.common.interceptor;

import com.jht.common.constant.BaseConstant;
import com.jht.common.redis.RedisUtil;
import com.jht.common.web.HttpStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @Description: token验证 临时解决
 * @author Alvis
 * @date 2017年12月6日 下午3:02:32
 */
public class TokenInterceptor implements HandlerInterceptor{

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String token = request.getHeader("Authorization");

        if (redisUtil.verifyTokenRedis(token, request)) {
            return true;
        } else {
            JsonResponse.jsonWrite(response, Integer.toString(HttpStatusEnum.UNAUTHORIZED.value()),
                    BaseConstant.MESSAGE_ERROR_TOKEN_MISSING);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }

}
