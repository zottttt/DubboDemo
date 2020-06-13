package com.zt.dubboprovider.dao;

import com.zt.dubboapi.entity.User;

import java.util.List;

/**
 * @作者 左涛Zot
 * @公众号 new一个对象
 * @博客 https://me.csdn.net/weixin_44143324
 * @时间 2020/6/13 9:26
 */
public interface UserMapper {
    List<User> getAllUsers();
}
