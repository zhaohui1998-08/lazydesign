package com.lazydesign.service;

import com.lazydesign.entity.English;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaohui
 * @since 2023-04-11
 */
public interface EnglishService extends IService<English> {

    int addEnglish(English english);



}
