package com.group.weiyi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 医院
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Hospital implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医院id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 医院名称
     */
    private String hname;

    /**
     * 医院地址
     */
    private String address;

    /**
     * 医院等级
     */
    private String grade;

    /**
     * 医院简介
     */
    private String intro;

    /**
     * 预约量
     */
    private String appointment;

    /**
     * 问诊量
     */
    private String inquiry;

    /**
     * 医院类型
     */
    private String type;


}
