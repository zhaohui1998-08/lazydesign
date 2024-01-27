package com.lazydesign.controller;


import com.alibaba.fastjson.JSON;
import com.lazydesign.entity.User;
import com.lazydesign.service.UserService;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springfox.documentation.spring.web.json.Json;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public int addEnglish(User user) {
        int i = userService.addUser(user);
        return i;
    }

    ;

    @PostMapping("/login")
    public HashMap login(@RequestBody Json json) {
        HashMap<Object, Object> req = new HashMap<>();
        Map mapType = JSON.parseObject(json.value(),Map.class);
        User user = JSON.parseObject(json.value(), User.class);
        User user1 = userService.selectUser(user);
        if (!Objects.isNull(user1)){
            req.put("loginState","1");
            req.put("loginState22","122");
        }
        return req;
    };

    @GetMapping("/login1")
    public ArrayList login1(@RequestBody Json json) {

        Map mapType = JSON.parseObject(json.value(),Map.class);


        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        return objects;
    };


}
