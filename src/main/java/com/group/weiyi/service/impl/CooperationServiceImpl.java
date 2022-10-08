package com.group.weiyi.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Cooperation;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.CooperationMapper;
import com.group.weiyi.service.CooperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-04
 */
@Service
public class CooperationServiceImpl extends ServiceImpl<CooperationMapper, Cooperation> implements CooperationService {

    @Autowired
    private CooperationMapper cooperationMapper;

    @Override
    public ResponseData<String> addAdvertising(String companyname, String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addAdvertising(companyname,name,position,phone,intention);
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
    public ResponseData<String> addCompany(String companyname, String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addCompany(companyname,name,position,phone,intention);
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
    public ResponseData<String> addDrugstore(String companyname, String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addDrugstore(companyname,name,position,phone,intention);
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
    public ResponseData<String> addHospital(String hospitalname, String hospitaltype,String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addHospital(hospitalname,hospitaltype,name,position,phone,intention);
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
    public ResponseData<String> addPatientNum(String companyname, String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addPatientNum(companyname,name,position,phone,intention);
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
    public ResponseData<String> addLive(String companyname, String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addLive(companyname,name,position,phone,intention);
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
    public ResponseData<String> addRecruit(String hospitalname, String hospitaltype, String name, String position, int phone, String intention) {
        boolean addPatient = cooperationMapper.addRecruit(hospitalname,hospitaltype,name,position,phone,intention);
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
}
