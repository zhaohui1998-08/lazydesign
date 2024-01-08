package com.lazydesign.service;

import com.lazydesign.entity.Analyzing;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lazydesign.entity.English;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaohui
 * @since 2024-01-08
 */
public interface AnalyzingService extends IService<Analyzing> {


    int addAnalyz(Analyzing analyzing);
}
