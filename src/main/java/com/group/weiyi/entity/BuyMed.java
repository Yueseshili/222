package com.group.weiyi.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 购药记录表
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BuyMed implements Serializable {
    // 购药id
    private Integer id;
    // 购药就诊人
    private String buyname;

    // 购药时间
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT + 8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data buytime;

    // 购药机构
    private String buyplace;

    // 药品名称
    private String medname;

    // 药品数量
    private String mednumber;

    // 购药上传图片
    private String medpic;
}
