package com.lazydesign.controller;


import com.lazydesign.entity.User;
import com.lazydesign.service.UserActionService;
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
@RequestMapping("/userAction")
public class UserActionController {

    @Autowired
    UserService userService;

    @Autowired
    UserActionService userActionService;

    @PostMapping("/upPassWord")
    public int upPassWord(User user,String newPassWord) {
        int i = userService.upUserById(user, newPassWord);
        return i;
    };

}
