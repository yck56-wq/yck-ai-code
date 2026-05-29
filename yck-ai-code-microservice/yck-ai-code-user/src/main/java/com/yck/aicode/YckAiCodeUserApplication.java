package com.yck.aicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.yck.aicode.mapper")
@ComponentScan("com.yck")
public class YckAiCodeUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(YckAiCodeUserApplication.class, args);
    }
}
