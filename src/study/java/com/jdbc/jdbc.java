package com.jdbc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class jdbc {

    @Value("jdbc:mysql://localhost:3306/lazydesign?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=Asia/Shanghai")
    String url;
    @Value("root")
    String username;
    @Value("root")
    String password;
    @Value("com.mysql.cj.jdbc.Driver")
    String driverClassName;
}
