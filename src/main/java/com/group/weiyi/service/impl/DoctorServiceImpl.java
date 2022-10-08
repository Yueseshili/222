package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.DoctorMapper;
import com.group.weiyi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 医生 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */

@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public ResponseData<List<Doctor>> findDoctorByHospital(int id) {
        ResponseData<List<Doctor>> responseData = new ResponseData<>();
        List<Doctor> list = doctorMapper.findDoctorByHospital(id);
        if (list != null){
            responseData.setCode(0);
            responseData.setData(list);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<List<Doctor>> findDoctorByClinic(int id) {
        ResponseData<List<Doctor>> responseData = new ResponseData<>();
        List<Doctor> list = doctorMapper.findDoctorByClinic(id);
        if (list != null){
            responseData.setCode(0);
            responseData.setData(list);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<List<Doctor>> findAllDoctor() {
        ResponseData<List<Doctor>> responseData = new ResponseData<>();
        List<Doctor> list = doctorMapper.findAllDoctor();
        if (list != null){
            responseData.setCode(0);
            responseData.setData(list);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Doctor> findDoctorById(int id) {
        ResponseData<Doctor> responseData = new ResponseData<>();
        Doctor doctor = doctorMapper.findDoctorById(id);
        if (doctor != null){
            responseData.setCode(0);
            responseData.setData(doctor);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }
}
