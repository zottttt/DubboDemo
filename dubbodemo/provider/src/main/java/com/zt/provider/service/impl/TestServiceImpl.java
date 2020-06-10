package com.zt.provider.service.impl;

import com.zt.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @作者 左涛Zot
 * @公众号 new一个对象
 * @博客 https://me.csdn.net/weixin_44143324
 * @时间 2020/6/10 21:39
 */
@Service(version = "1.0.0",interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void select() {
        System.out.println("select");
    }
}
