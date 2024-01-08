package com.lazydesign.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@ApiModel(value="English对象", description="")
public class English implements Serializable {

    private static final long serialVersionUID = -9007519975119278375L;

    private String id = UUID.randomUUID().toString();

    private String word;

    private String translate;

    private Timestamp createTime;


}
