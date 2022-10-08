package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 医生 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface DoctorService extends IService<Doctor> {

    ResponseData<List<Doctor>> findDoctorByHospital(int id);

    ResponseData<List<Doctor>> findDoctorByClinic(int id);

    ResponseData<List<Doctor>> findAllDoctor();

    ResponseData<Doctor> findDoctorById(int id);
}
