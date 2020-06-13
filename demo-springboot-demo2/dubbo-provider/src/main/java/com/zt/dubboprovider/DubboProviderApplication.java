package com.zt.dubboprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
@MapperScan("com.zt.dubboprovider.dao")
public class DubboProviderApplication {

    public static void main(String[] args) {
        System.out.println("提供者已经启动。。。。。。。。。。。。。。。。");
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
