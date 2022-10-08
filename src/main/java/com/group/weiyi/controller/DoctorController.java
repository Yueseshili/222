package com.group.weiyi.controller;


import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.DoctorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 医生 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "医生模块接口",description = "关于医生的接口")
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @ApiOperation(value = "/findDoctorByHospital 通过医院查询医生" )
    @RequestMapping(value = "/findDoctorByHospital",method = RequestMethod.GET)
    public ResponseData<List<Doctor>> findDoctorByHospital(int id){
        return doctorService.findDoctorByHospital(id);
    }
    @ApiOperation(value = "/findDoctorByClinic 通过门诊查询医生" )
    @RequestMapping(value = "/findDoctorByClinic",method = RequestMethod.GET)
    public ResponseData<List<Doctor>> findDoctorByClinic(int id){
        return doctorService.findDoctorByClinic(id);
    }

    @ApiOperation(value = "/findAllDoctor 查询所有医生" )
    @RequestMapping(value = "/findAllDoctor",method = RequestMethod.GET)
    public ResponseData<List<Doctor>> findAllDoctor(){
        return doctorService.findAllDoctor();
    }

    @ApiOperation(value = "/findDoctorById 通过医生id查询医生" )
    @RequestMapping(value = "/findDoctorById",method = RequestMethod.GET)
    public ResponseData<Doctor> findDoctorById(int id){
        return doctorService.findDoctorById(id);
    }
}

