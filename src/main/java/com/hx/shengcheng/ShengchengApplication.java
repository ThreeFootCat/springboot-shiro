package com.hx.shengcheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hx.shengcheng.dao")
public class ShengchengApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShengchengApplication.class, args);
    }

}
