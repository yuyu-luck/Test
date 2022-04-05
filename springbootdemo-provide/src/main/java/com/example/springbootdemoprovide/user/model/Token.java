package com.example.springbootdemoprovide.user.model;

public class Token {
    private Integer id;

    private String info;

    private String tokenuuid;

    public Token(Integer id, String info, String tokenuuid) {
        this.id = id;
        this.info = info;
        this.tokenuuid = tokenuuid;
    }

    public Token() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTokenuuid() {
        return tokenuuid;
    }

    public void setTokenuuid(String tokenuuid) {
        this.tokenuuid = tokenuuid;
    }
}