package com.lanou.gittub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启缓存
public class GittubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GittubApplication.class, args);
    }

}
