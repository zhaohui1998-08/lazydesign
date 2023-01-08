package com.lazydesign.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lazydesign.entity.UserTest;

import java.util.List;

/**
 * @author zhaohui
 * data:2023/1/8
 */
public interface UserService extends IService<UserTest> {
    List<UserTest> listAll();
}
