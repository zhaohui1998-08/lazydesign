package com.lazydesign.controller;


import com.lazydesign.entity.Analyzing;
import com.lazydesign.entity.User;
import com.lazydesign.service.AnalyzingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
@RestController
@RequestMapping("/analyzing")
public class AnalyzingController {

    @Autowired
    AnalyzingService analyzingService;

    @PostMapping("/addAnalyz")
    public int addAnalyz(Analyzing analyzing) {
        int i = analyzingService.addAnalyz(analyzing);
        return i;
    }

    ;


    @GetMapping("/selAllAnalyz")
    public List<Analyzing> selAllAnalyz() {
        List<Analyzing> analyzings = analyzingService.selAllAnalyz();
        return analyzings;
    }

    ;


    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);
    }

}
