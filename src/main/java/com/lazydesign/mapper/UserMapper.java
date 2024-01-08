package com.lazydesign.mapper;

import com.lazydesign.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
