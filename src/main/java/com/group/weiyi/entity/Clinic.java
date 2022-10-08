package com.group.weiyi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 门诊
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Clinic implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 门诊id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 门诊名称
     */
    private String name;

    /**
     * 科室id
     */
    private Integer eId;

    /**
     * 医院id
     */
    private Integer hId;


}
