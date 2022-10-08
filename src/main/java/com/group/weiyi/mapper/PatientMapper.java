package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Mydoctor;
import com.group.weiyi.entity.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 就诊人 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface PatientMapper extends BaseMapper<Patient> {

    boolean addPatient(@Param("name") String name, @Param("idcard") String idcard, @Param("sex") String sex, @Param("age") String age, @Param("phone") String phone, @Param("status") String status);


    List<Mydoctor> queryMydoctor(int id);
}
