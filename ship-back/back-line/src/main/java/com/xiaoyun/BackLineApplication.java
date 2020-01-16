package com.xiaoyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.xiaoyun.mapper")
@SpringBootApplication
public class BackLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackLineApplication.class, args);
    }

}
