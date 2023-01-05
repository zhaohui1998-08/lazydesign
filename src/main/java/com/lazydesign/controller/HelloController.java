package com.lazydesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String Hello(){
        return "aaaaaaaaaaaaaaa";
    }

    @GetMapping
    public String Hello222() {
        return "777777777";
    }
    @GetMapping
    public String Hello22222222() {
        return "33333";
    }

}
