package com.lazydesign.service.impl;

import com.lazydesign.entity.User;
import com.lazydesign.entity.UserAction;
import com.lazydesign.enums.UserActionEnum;
import com.lazydesign.mapper.UserActionMapper;
import com.lazydesign.service.UserActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
@Service
public class UserActionServiceImpl extends ServiceImpl<UserActionMapper, UserAction> implements UserActionService {

    @Autowired
    UserActionMapper userActionMapper;



    @Override
    public int addUserAction(User user,String newPassWord) {
        UserAction userAction = new UserAction();
        userAction.setUserId(user.getUserId());
        userAction.setActionEnum(UserActionEnum.P.getCode());
        userAction.setOldData(user.getPassWord());
        userAction.setNewData(newPassWord);
        int insert = userActionMapper.insert(userAction);
        return insert;
    }
}
