package com.group.weiyi.controller;


import com.group.weiyi.entity.Hospital;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.HospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 医院 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "医院模块接口",description = "关于医院的接口")
@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;
    @ApiOperation(value = "/selectAllHospital 获取所有医院")
    @RequestMapping(value = "/selectAllHospital",method = RequestMethod.POST)
    public ResponseData<List<Hospital>> selectAllHospital(){
        return hospitalService.selectAllHospital();
    }

    public ResponseData<String> addHospital(Hospital hospital){
        return hospitalService.addHospital(hospital);
    }

}

