package com.lazydesign.service;

import com.lazydesign.entity.User;
import com.lazydesign.entity.UserAction;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
public interface UserActionService extends IService<UserAction> {

    int addUserAction(User user,String newPassWord);
}
