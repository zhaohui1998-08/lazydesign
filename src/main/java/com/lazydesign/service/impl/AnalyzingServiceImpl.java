package com.lazydesign.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazydesign.entity.Analyzing;
import com.lazydesign.mapper.AnalyzingMapper;
import com.lazydesign.service.AnalyzingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;

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

    @Resource
    BaseMapper baseMapper;

    @Override
    public int addAnalyz(Analyzing analyzing) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        analyzing.setCreateTime(timestamp);
        int insert = baseMapper.insert(analyzing);
        return  insert;
    }
}
