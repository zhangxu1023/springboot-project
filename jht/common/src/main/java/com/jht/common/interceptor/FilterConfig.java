package com.jht.common.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<HttpServletRequestReplacedFilter> RegistTest1(){
        //通过FilterRegistrationBean实例设置优先级可以生效
        //通过@WebFilter无效
        FilterRegistrationBean<HttpServletRequestReplacedFilter> bean = new FilterRegistrationBean<HttpServletRequestReplacedFilter>();
        bean.setFilter(new HttpServletRequestReplacedFilter());//注册自定义过滤器
        bean.setName("flilter1");//过滤器名称
        bean.addUrlPatterns("/*");//过滤所有路径
        bean.setOrder(1);//优先级，最顶级
        return bean;
    }
}
