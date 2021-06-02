package com.jht.common.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sizhenzhen
 * @date 2021年05月22日 22:49:08
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public LogInterceptor getLogInterceptor(){
        return new LogInterceptor();
    }

    @Bean
    public TokenInterceptor getTokenInterceptor(){
        return new TokenInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLogInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getTokenInterceptor()).addPathPatterns("/**").excludePathPatterns("/**/login");
    }
}
