package com.lazydesign.mapper;

import com.lazydesign.entity.Word;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaohui
 * @since 2023-04-11
 */
@Mapper
@Primary
public interface WordMapper extends BaseMapper<Word> {

}
