package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Mydoctor;
import com.group.weiyi.entity.Patient;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 就诊人 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface PatientService extends IService<Patient> {

    ResponseData<String> addPatient(String name, String idcard, String sex, String age, String phone, String status);

    ResponseData<List<Mydoctor>> queryMydoctor(int id);
}
