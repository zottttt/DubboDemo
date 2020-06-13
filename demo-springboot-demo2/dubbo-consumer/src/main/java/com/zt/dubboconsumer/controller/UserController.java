package com.zt.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zt.dubboapi.entity.User;
import com.zt.dubboapi.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者 左涛Zot
 * @公众号 new一个对象
 * @博客 https://me.csdn.net/weixin_44143324
 * @时间 2020/6/13 9:52
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/getAllUsers")
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
