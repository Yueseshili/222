package com.group.weiyi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 疾病
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Illness implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 疾病id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 疾病名称
     */
    private String name;

    /**
     * 部位id
     */
    private Integer bId;


}
