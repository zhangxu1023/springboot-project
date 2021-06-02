package com.jht.common.interceptor;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Alvis
 * @Description: 代理转换 filter
 * @date 2017年11月27日 下午4:38:21
 */
public class HttpServletRequestReplacedFilter implements Filter {
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) response;
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Credentials", "true");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header, Authorization");
        resp.addHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,PUT,DELETE,HEAD");
        ServletRequest requestWrapper = null;
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            if ("POST".equalsIgnoreCase(httpServletRequest.getMethod())
                    && httpServletRequest.getContentType().equalsIgnoreCase(
                    "application/json")) {
                requestWrapper = new com.jht.common.interceptor.BodyReaderHttpServletRequestWrapper(
                        (HttpServletRequest) request);
            }
        }

        if (requestWrapper == null) {
            chain.doFilter(request, response);
        } else {
            chain.doFilter(requestWrapper, response);
        }
    }

    public void init(com.jht.common.interceptor.FilterConfig arg0) throws ServletException {

    }
}
