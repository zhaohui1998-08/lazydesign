package com.lazydesign.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.lazydesign.entity.User;
import com.lazydesign.mapper.UserMapper;
import com.lazydesign.service.UserActionService;
import com.lazydesign.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserActionService userActionService;

    @Override
    public int addUser(User user) {
        user.setIsBlack(0);
        int insert = userMapper.insert(user);
        return  insert;
    }

    @Override
    public int upUserById(User user,String newPassWord) {
        UpdateWrapper objectUpdateWrapper = new UpdateWrapper<>();
        objectUpdateWrapper.eq("id",user.getId());
        objectUpdateWrapper.set("pass_word",newPassWord);
        int update = userMapper.update(user, objectUpdateWrapper);
        if (update > 0){
            int i = userActionService.addUserAction(user, newPassWord);
            log.info("插入用户操作数据{}条",i);
        }
        return update;
    }

    @Override
    public User selectUser(User user) {
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("user_name",user.getUserName()).eq("pass_word",user.getPassWord());
        User reqUser = userMapper.selectOne(objectQueryWrapper);
        return reqUser;
    }
}
