package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Mydoctor;
import com.group.weiyi.entity.Patient;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.PatientMapper;
import com.group.weiyi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 就诊人 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public ResponseData<String> addPatient(String name, String idcard, String sex, String age, String phone, String status) {
        boolean addPatient = patientMapper.addPatient(name, idcard, sex, age, phone, status);
        ResponseData<String> responseData = new ResponseData<>();
        if (true) {
            responseData.setCode(0);
            responseData.setMsg("success");
        } else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;

    }

    @Override
    public ResponseData<List<Mydoctor>> queryMydoctor(int id) {
        ResponseData<List<Mydoctor>> responseData = new ResponseData<>();
        List<Mydoctor> queryMydoctor = patientMapper.queryMydoctor(id);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setData(queryMydoctor);
        return responseData;
    }

}
