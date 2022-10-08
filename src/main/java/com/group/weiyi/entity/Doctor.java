package com.group.weiyi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 医生
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Doctor implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医生id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 医生姓名
     */
    private String name;

    /**
     * 评分
     */
    private Double grade;

    /**
     * 职位
     */
    private String position;

    /**
     * 接诊率
     */
    private Double reception;

    /**
     * 问诊量
     */
    private Integer inquiry;

    /**
     * 医生信息
     */
    private String information;

    /**
     * 科室id
     */
    private Integer eId;

    /**
     * 门诊id
     */
    private Integer cId;

    /**
     * 医院id
     */
    private Integer hId;

    /**
     * 本地医生
     */
    private Integer localtype;

    private Epartmene epartmene;

    private Hospital hospital;


}
