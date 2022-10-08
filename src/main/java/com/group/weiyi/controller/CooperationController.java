package com.group.weiyi.controller;


import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.CooperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-04
 */
@Api(tags = "合作入住接口",description = "提交合作意向信息")
@RestController
@RequestMapping("/cooperation")
public class CooperationController {
    @Autowired
    private CooperationService cooperationService;

    @ApiOperation(value = "/addAdvertising 添加广告合作意向")
    @RequestMapping(value = "/addAdvertising", method = RequestMethod.POST)
    public ResponseData<String> addAdvertising(String companyname, String name, String position, int phone, String intention) {
        return cooperationService.addAdvertising(companyname,name,position,phone,intention);
    }

    @ApiOperation(value = "/addCompany 添加企业合作意向")
    @RequestMapping(value = "/addCompany", method = RequestMethod.POST)
    public ResponseData<String> addCompany(String companyname, String name, String position, int phone, String intention) {
        return cooperationService.addCompany(companyname,name,position,phone,intention);
    }

    @ApiOperation(value = "/addDrugstore 添加药店合作意向")
    @RequestMapping(value = "/addDrugstore", method = RequestMethod.POST)
    public ResponseData<String> addDrugstore(String companyname, String name, String position, int phone, String intention) {
        return cooperationService.addDrugstore(companyname,name,position,phone,intention);
    }

    @ApiOperation(value = "/addHospital 添加医院合作意向")
    @RequestMapping(value = "/addHospital", method = RequestMethod.POST)
    public ResponseData<String> addHospital(String hospitalname,String hospitaltype, String name, String position, int phone, String intention) {
        return cooperationService.addHospital(hospitalname,hospitaltype,name,position,phone,intention);
    }

    @ApiOperation(value = "/addPatientNum 添加号源合作意向")
    @RequestMapping(value = "/addPatientNum", method = RequestMethod.POST)
    public ResponseData<String> addPatientNum(String companyname, String name, String position, int phone, String intention) {
        return cooperationService.addPatientNum(companyname,name,position,phone,intention);
    }

    @ApiOperation(value = "/addLive 添加直播合作意向")
    @RequestMapping(value = "/addLive", method = RequestMethod.POST)
    public ResponseData<String> addLive(String companyname, String name, String position, int phone, String intention) {
        return cooperationService.addLive(companyname,name,position,phone,intention);
    }

    @ApiOperation(value = "/addRecruit 添加招聘合作意向")
    @RequestMapping(value = "/addRecruit", method = RequestMethod.POST)
    public ResponseData<String> addRecruit(String hospitalname,String hospitaltype, String name, String position, int phone, String intention) {
        return cooperationService.addRecruit(hospitalname,hospitaltype,name,position,phone,intention);
    }
}

