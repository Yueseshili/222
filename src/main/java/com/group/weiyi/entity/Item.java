package com.group.weiyi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Item implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 订单id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 订单编号
     */
    private String num;

    /**
     * 总金额
     */
    private BigDecimal count;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 订单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") //在接收json数据时 将 字符串yyyy-MM-dd HH:mm:ss ---Date
    // 返回json 时，将  Date birthday       转化为字符串yyyy-MM-dd HH:mm:ss
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")  // 作用和时间转换器服务效果一致   可以将提交的键值对 yyyy-MM-dd HH:mm:ss ---Date

    private String createtime;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 用户id
     */
    private String uId;


}
