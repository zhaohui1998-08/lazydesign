package com.lazydesign.controller;


import com.lazydesign.entity.English;
import com.lazydesign.service.EnglishService;
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
 * @since 2023-04-11
 */
@RestController
@RequestMapping("/english")
public class EnglishController {
    @Autowired
    EnglishService englisHervice;

    @PostMapping("/addWord")
    public int addWord(English english) {
        int i = englisHervice.addWord(english);
        return i;
    };


}
