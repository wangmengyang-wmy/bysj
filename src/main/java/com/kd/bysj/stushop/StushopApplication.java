package com.kd.bysj.stushop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.kd.bysj.stushop.dao")//扫描mapper
public class StushopApplication {

    public static void main(String[] args) {
        SpringApplication.run(StushopApplication.class, args);
    }

}
