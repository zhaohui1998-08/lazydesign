package com.lazydesign.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazydesign.entity.English;
import com.lazydesign.mapper.EnglishMapper;
import com.lazydesign.service.EnglishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohui
 * @since 2023-04-11
 */
@Service("englishService")
public class EnglishServiceImpl extends ServiceImpl<EnglishMapper, English> implements EnglishService {


    @Autowired
    EnglishMapper englishMapper;

    @Override
    public int addEnglish(English english) {
        int insert = englishMapper.insert(english);
        return  insert;
    }
}
