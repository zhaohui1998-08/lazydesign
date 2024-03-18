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

import static javafx.scene.input.KeyCode.L;


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
        Map mapType = JSON.parseObject(json.value(), Map.class);
        User user = JSON.parseObject(json.value(), User.class);
        User user1;

        user1 = userService.selectUser(user);
        if (!Objects.isNull(user1)) {
            req.put("loginState", "1");
            req.put("loginState22", "122");
        }
        return req;
    }

    ;

    @GetMapping("/login1")
    public ArrayList login1(@RequestBody Json json) {

        Map mapType = JSON.parseObject(json.value(), Map.class);


        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        return objects;
    }

    ;

    public static void main(String[] args) throws ParseException {

//        BigDecimal bigDecimal =BigDecimal.ZERO;
//        BigDecimal bigDecimal1 = new BigDecimal(-1);
//        BigDecimal bigDecimal2 = new BigDecimal(0.0);
//        BigDecimal bigDecimal3 = new BigDecimal("0.00");
//        BigDecimal bigDecimal4 = BigDecimal.valueOf(0.00);
//
//        BigDecimal bigDecimal6 = bigDecimal3.setScale(0,BigDecimal.ROUND_UP);
//
//
//        int i = bigDecimal.compareTo(bigDecimal3);
//
//
//        int equals = bigDecimal.compareTo(bigDecimal2);
//
//        String a ="0";
//        boolean equals1 = a.equals(equals);
//
//        Integer qwe = 1 ;
//
//        boolean equals2 = qwe.equals("0");


        //方法一：
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(date1);
        System.out.println(date1);
        System.out.println(date1.getTime());
        Date date2 = new Date(date1.getTime());
        System.out.println(date2);
        long time = date1.getTime();
        Date date3 = new Date(time);
        System.out.println(date3);

        Long aLong = Long.valueOf(time);
        System.out.println(aLong);

    }



}
