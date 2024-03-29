package com.lazydesign.controller;


import com.lazydesign.entity.English;
import com.lazydesign.service.EnglishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaohui
 * @since 2023-04-11
 */
@RestController
@RequestMapping("/english")
public class EnglishController {
    @Autowired
    EnglishService englishService;

    @PostMapping("/addEnglish")
    public int addEnglish(English english) {
        int i = englishService.addEnglish(english);
        return i;
    };

    @GetMapping("/test2")
    public String test2() {
        return "/announcement/home";
    };

}
