package com.lazydesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaohui
 * data:2023/1/8
 */

@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String Hello() {
        System.out.println("aaaa");
        return "aaaaaaaaaaaaaaa";
    }

    //mybatis-plus自带查询方法
    @GetMapping("/list")
    public List<UserTest> Hello222() {
        System.out.println("1111");
        return userService.list();
    }

    //自写查询全部方法
    @GetMapping("/listAll")
    public List<UserTest> Test01() {
        System.out.println("2222");
        return userService.listAll();
    }

}
