package com.group.weiyi.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 门诊记录
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ClinicreCords implements Serializable {
    // 门诊记录 id
    private String clinicpic;
    // 门诊记录 就诊人
    private String attendees;
    // 门诊记录 就诊时间
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT + 8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data clinictime;
    // 门诊记录 医院
    private String hospital;
    // 门诊记录 科室
    private String epartmene;
    // 门诊记录 医生姓名
    private String doname;
    // 门诊记录 诊断
    private String diagnosis;
    // 门诊记录 病情描述
    private String diseasedescription;

}
