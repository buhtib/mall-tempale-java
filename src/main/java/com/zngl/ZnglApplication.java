package com.zngl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.zngl.dao"})
public class ZnglApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZnglApplication.class, args);
    }

}
