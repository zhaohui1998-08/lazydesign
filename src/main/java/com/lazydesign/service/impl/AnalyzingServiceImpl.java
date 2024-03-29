package com.lazydesign.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazydesign.entity.Analyzing;
import com.lazydesign.mapper.AnalyzingMapper;
import com.lazydesign.service.AnalyzingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
@Service("analyzingService")
public class AnalyzingServiceImpl extends ServiceImpl<AnalyzingMapper, Analyzing> implements AnalyzingService {

    @Autowired
    AnalyzingMapper analyzingMapper;


    @Override
    public int addAnalyz(Analyzing analyzing) {
        int insert = analyzingMapper.insert(analyzing);
        return  insert;
    }

    @Override
    public List<Analyzing> selAllAnalyz() {
        List<Analyzing> analyzings = analyzingMapper.selectList(null);
        return analyzings;
    }
}
