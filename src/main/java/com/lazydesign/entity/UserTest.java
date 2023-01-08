package com.lazydesign.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * @author zhaohui
 * data:2023/1/8
 */
@Data
@TableName(value = "usertest")
public class UserTest {
    private int id;
    private String name;
    private int age;
    private String email;

}
