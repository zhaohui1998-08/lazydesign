package com.lazydesign.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.UUID;

import io.swagger.annotations.ApiModel;
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
@ApiModel(value="Analyzing对象", description="")
public class Analyzing implements Serializable{

    private static final long serialVersionUID = 5394347606090679516L;

    private String id = UUID.randomUUID().toString();

    private Timestamp createTime = new Timestamp(System.currentTimeMillis());;

    private String address;

    private String webType;


}
