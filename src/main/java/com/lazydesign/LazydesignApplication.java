package com.lazydesign;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaohui
 * data:2023/1/8
 */
@SpringBootApplication
//@MapperScan(basePackages = { "com.lazydesign.mapper"})
public class LazydesignApplication {
    public static void main(String[] args) {
        SpringApplication.run(LazydesignApplication.class, args);
    }

}
