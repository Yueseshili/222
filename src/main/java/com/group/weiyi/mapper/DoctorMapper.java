package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Doctor;

import java.util.List;

/**
 * <p>
 * 医生 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface DoctorMapper extends BaseMapper<Doctor> {

    List<Doctor> findDoctorByHospital(int id);

    List<Doctor> findDoctorByClinic(int id);

    List<Doctor> findAllDoctor();

    Doctor findDoctorById(int id);
}
