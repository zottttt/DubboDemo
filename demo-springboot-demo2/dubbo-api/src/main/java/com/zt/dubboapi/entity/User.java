package com.zt.dubboapi.entity;

import java.io.Serializable;

/**
 * @作者 左涛Zot
 * @公众号 new一个对象
 * @博客 https://me.csdn.net/weixin_44143324
 * @时间 2020/6/13 9:19
 */
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String password;
    private String flag;

    public User() {
    }

    public User(Integer userId, String userName, String password, String flag) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.flag = flag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
