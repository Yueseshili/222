package com.group.weiyi.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 体检记录
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MedicalRecord implements Serializable {
    // 体检记录 Id
    private Integer id;
    // 体检记录 体检就诊人
    private String attendees;
    // 体检记录 体检时间
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT + 8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data medicaltime;
    // 体检记录 体检机构
    private String medicalinstitution;
    // 体检记录 体检报告名称
    private String reportname;
}
