package com.lazydesign.entity;

import java.io.Serializable;
import java.util.UUID;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohui
 * @since 2023-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Word对象", description="")
public class Word implements Serializable {

    @TableId
    private static final long serialVersionUID = 1L;

    private String word;

    private String translate;

    private String creatime;

   // private String id;

}
