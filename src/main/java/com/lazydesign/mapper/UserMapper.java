package com.lazydesign.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.lazydesign.entity.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhaohui
 * data:2023/1/8
 */
@Mapper
public interface UserMapper extends BaseMapper<UserTest> {
    //自写查询全部方法测试UserMapper。xml配置
    List<UserTest> listAll();

    @Select(value = "select * from usertest where id = 1")
    List<UserTest> listAll2();


}
