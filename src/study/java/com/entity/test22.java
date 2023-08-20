package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class test22 {



    @Transactional
    public void a() {
        System.out.println("需要执行的逻辑");
        System.out.println("事务之前");
    }

    //定时任务
    @Scheduled(cron = "* * * * * ?")
    public void bb(){
        System.out.println("定时任务");
    }
}
