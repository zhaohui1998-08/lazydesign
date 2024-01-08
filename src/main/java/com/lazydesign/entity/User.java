package com.lazydesign.entity;

import java.io.Serializable;
import java.sql.Timestamp;
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
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1479362276998348364L;

    private String id = UUID.randomUUID().toString();

    private String userId;

    private String userName;

    private String passWord;

    private Integer isBlack;

    private Timestamp createTime = new Timestamp(System.currentTimeMillis());;

}
