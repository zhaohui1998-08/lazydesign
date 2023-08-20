package com.lazydesign.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazydesign.entity.English;
import com.lazydesign.mapper.EnglishMapper;
import com.lazydesign.service.EnglishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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


    @Resource
    BaseMapper baseMapper;

    @Override
    public int addWord(English english) {
        int insert = baseMapper.insert(english);
        return  insert;
    }
}
