package com.lazydesign.service.impl;

import com.lazydesign.entity.Word;
import com.lazydesign.mapper.WordMapper;
import com.lazydesign.service.WordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohui
 * @since 2023-04-11
 */
@Service("wordService")
public class WordServiceImpl extends ServiceImpl<WordMapper, Word> implements WordService {

}
