package com.jht.common.jwt;

import java.io.Serializable;
import java.util.List;

public class UserToken implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String token;
    private String type; //类型 前台用户 后台管理员
    private List<String> url;//后台请求权限
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
