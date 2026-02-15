package com.yck.aicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yck.aicode.mapper")
public class YckAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(YckAiCodeApplication.class, args);
    }

}
