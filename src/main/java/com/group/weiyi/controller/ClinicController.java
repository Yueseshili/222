package com.group.weiyi.controller;


import com.group.weiyi.entity.Clinic;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.ClinicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 门诊 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "门诊模块接口",description = "关于门诊的接口")
@RestController
@RequestMapping("/clinic")
public class ClinicController {
    @Autowired
    private ClinicService clinicService;

    @ApiOperation(value = "/selectClinicByHospitalAndEpartmene 通过医院和科室查询门诊")
    @RequestMapping(value = "/selectClinicByHospitalAndEpartmene",method = RequestMethod.GET)
    private ResponseData<List<Clinic>> selectClinicByHospitalAndEpartmene(int h_id, int e_id){
        return clinicService.selectClinicByHospitalAndEpartmene(h_id,e_id);
    }
}

