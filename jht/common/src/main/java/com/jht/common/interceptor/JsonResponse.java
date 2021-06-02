package com.jht.common.interceptor;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 输出json工具类
 * @author Alvis
 * @date 2017年12月11日 上午10:11:51
 */
public class JsonResponse {
    public static Logger logger = LoggerFactory.getLogger(JsonResponse.class);
    /**
     * @Description 输出json
     * @param response
     * @param code 返回码
     * @param message 返回信息
     * @throws Exception
     * @author Alvis
     * @date 2017年12月11日 上午10:12:06
     */
    @SuppressWarnings("unused")
    public static void jsonWrite(HttpServletResponse response, String code, String message) {
        Map<String,String> map = new HashMap<String,String>();  
        map.put("code", code);  
        map.put("message", message);
        Object json = JSONObject.toJSON(map);
        response.setHeader("Cache-Control", "no-cache");
        //response.setContentType("text/html; charset=UTF-8"); 
        response.setContentType("application/json;charset=utf-8"); //json形式输出
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.write(json.toString());
        } catch (IOException e) {
            logger.error("error in {},errorMessage {}", JsonResponse.class, e.getMessage());
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
