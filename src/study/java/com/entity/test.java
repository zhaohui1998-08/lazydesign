package com.entity;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class test {

    @Before("execution(* com.entity.tc.a(..))")
    public  void do1(){
        System.out.println("前置");
    }

    @After("execution(* com.entity.*.*(..))")
    public  void do2(){
        System.out.println("后置222");
    }
}
