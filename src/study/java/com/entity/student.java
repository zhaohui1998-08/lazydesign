package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class student {
    @Value("张三")
    String name;
    @Value("10")
    int age;


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:aop.xml");
        tc bean = classPathXmlApplicationContext.getBean(tc.class);
        bean.a();

    }
}
