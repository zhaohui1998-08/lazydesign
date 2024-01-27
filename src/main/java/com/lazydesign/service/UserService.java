package com.lazydesign.service;

import com.lazydesign.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
public interface UserService extends IService<User> {

    int addUser(User user);

    int upUserById(User user,String newPassWord);

    User selectUser(User user);

}
