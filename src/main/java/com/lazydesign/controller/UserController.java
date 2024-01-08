package com.lazydesign.controller;


import com.lazydesign.entity.English;
import com.lazydesign.entity.User;
import com.lazydesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
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
    };


}
