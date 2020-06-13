package com.zt.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zt.dubboapi.entity.User;
import com.zt.dubboapi.service.UserService;
import com.zt.dubboprovider.dao.UserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @作者 左涛Zot
 * @公众号 new一个对象
 * @博客 https://me.csdn.net/weixin_44143324
 * @时间 2020/6/13 9:26
 */
@Service(timeout = 10000)
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
