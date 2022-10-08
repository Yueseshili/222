package com.group.weiyi.controller;


import com.group.weiyi.entity.Mydoctor;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 就诊人 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "我的医生接口",description = "用户添加就诊人信息，此功能可在健康记录仪下的病历本添加我的医生")
@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    /**
     * 添加就诊人员信息
     * @param name
     * @param idcard
     * @param sex
     * @param age
     * @param phone
     * @param status
     * @return
     */
    @ApiOperation(value = "/addPatient 添加就诊人")
    @RequestMapping(value = "/addPatient",method = RequestMethod.POST)
    public ResponseData<String> addPatient(String name, String idcard, String sex, String age, String phone, String status) {
        return patientService.addPatient(name,idcard,sex,age,phone,status);
    }
    @ApiOperation(value = "/queryMydoctor 查询我的医生信息")
    @RequestMapping(value = "/queryMydoctor", method = RequestMethod.POST)
    public ResponseData<List<Mydoctor>> queryMydoctor(int id) {
        return patientService.queryMydoctor(id);
    }


}

