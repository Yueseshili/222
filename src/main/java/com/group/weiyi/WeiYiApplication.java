package com.group.weiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.group.weiyi.mapper")
@SpringBootApplication
public class WeiYiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeiYiApplication.class,args);
    }
}
