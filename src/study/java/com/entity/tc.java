package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class tc {
    @Autowired
    student student;

    @Value("11")
    String tcname;

    public void a() {
        System.out.println("tc内的方法");
    }
}
