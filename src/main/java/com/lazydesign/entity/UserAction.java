package com.lazydesign.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.UUID;

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
 * @since 2024-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserAction对象", description="")
public class UserAction implements Serializable {

    private static final long serialVersionUID = -7901530313333762109L;

    private Timestamp createTime = new Timestamp(System.currentTimeMillis());;

    private String id = UUID.randomUUID().toString();

    private String actionEnum;

    private String userId;

    private String oldData;

    private String newData;



}
