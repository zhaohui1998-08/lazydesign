package com.lazydesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lazydesign.entity.UserTest;
import com.lazydesign.mapper.UserMapper;
import com.lazydesign.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaohui
 * data:2023/1/8
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserTest> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserTest> listAll() {
        return userMapper.listAll2();
    }
}
