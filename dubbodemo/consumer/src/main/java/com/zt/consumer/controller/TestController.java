package com.zt.consumer.controller;

import com.zt.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 左涛Zot
 * @公众号 new一个对象
 * @博客 https://me.csdn.net/weixin_44143324
 * @时间 2020/6/10 21:50
 * 调用dubbo
 */
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    TestService testService;

    @RequestMapping("/insert")
    public String insert(){
        testService.insert();
        return "insert";
    }

    @RequestMapping("/delete")
    public String delete(){
        testService.delete();
        return "delete";
    }

    @RequestMapping("/update")
    public String update(){
        testService.update();
        return "update";
    }

    @RequestMapping("/select")
    public String select(){
        testService.select();
        return "select";
    }
}
