package com.group.weiyi.controller;


import com.group.weiyi.entity.BuyMed;
import com.group.weiyi.entity.ClinicreCords;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.HealthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 健康模块下的健康记录仪功能模块
 *
 *
 * @author group
 * @since 2022-10-03
 */

@Api(tags = "健康模块下的健康记录仪功能模块",description = "健康模块下的健康记录仪功能模块")
@RestController
@RequestMapping("/health")
public class HealthController {
    @Autowired
    private HealthService healthService;

    @ApiOperation(value = "/findAllInfoInQuiry 健康模块下的健康记录仪功能下的去问诊下的搜索框和点击“妇科”等模块的功能")
    @RequestMapping(value = "/findAllInfoInQuiry", method = RequestMethod.GET)
    public ResponseData<List<Doctor>> findAllInfoInQuiry(String input) {

        return healthService.findAllInfoInQuiry(input);
    }

    @ApiOperation(value = "/addPatient 再没有就诊人的情况下添加就诊人的信息")
    @RequestMapping(value = "/addPatient", method = RequestMethod.GET)
    public ResponseData<Map> addPatient(String name, String idcard, String sex, Integer age, String phone, String status) {

        return healthService.addPatient(name, idcard, sex, age, phone, status);

    }



    @ApiOperation(value = "/delPatient 通过ID删除就诊人的信息")
    @RequestMapping(value = "/delPatient", method = RequestMethod.GET)
    public ResponseData<Map> delPatient(Integer id) {

        return healthService.delPatient(id);

    }


    @ApiOperation(value = "/addBuyMed 再没有购药记录的情况下添加就购药记录的信息")
    @RequestMapping(value = "/addBuyMed", method = RequestMethod.GET)
    public ResponseData<Map> addBuyMed(String buyname, String buytime, String buyplace, String medname, Integer mednumber) {

        return healthService.addBuyMed(buyname, buytime, buyplace, medname, mednumber);
    }

    @ApiOperation(value = "/upBuyMed 修改购药记录的信息")
    @RequestMapping(value = "/upBuyMed", method = RequestMethod.GET)
    public ResponseData<Map> upBuyMed(int id,String buyname, String buytime, String buyplace, String medname, Integer mednumber) {

        return healthService.upBuyMed(id,buyname, buytime, buyplace, medname, mednumber);
    }

    @ApiOperation(value = "/findBuyMed 再有购药记录的情况下查询所有的购药记录的信息")
    @RequestMapping(value = "/findBuyMed", method = RequestMethod.GET)
    public ResponseData<List<BuyMed>> findBuyMed() {

        return healthService.findBuyMed();
    }

    @ApiOperation(value = "/delBuyMed 通过ID删除购药记录信息")
    @RequestMapping(value = "/delBuyMed", method = RequestMethod.GET)
    public ResponseData<Map> delBuyMed(Integer id) {

        return healthService.delBuyMed(id);

    }

    @ApiOperation(value = "/addClinicreCords 添加门诊记录信息")
    @RequestMapping(value = "/addClinicreCords", method = RequestMethod.GET)
    public ResponseData<Map> addClinicreCords(String attendees,String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription) {

        return healthService.addClinicreCords(attendees, clinictime, hospital, epartmene, doname, diagnosis, diseasedescription);
    }

    @ApiOperation(value = "/delClinicreCords 通过ID删除门诊记录信息")
    @RequestMapping(value = "/delClinicreCords", method = RequestMethod.GET)
    public ResponseData<Map> delClinicreCords(Integer id) {

        return healthService.delClinicreCords(id);

    }
    @ApiOperation(value = "/findClinicreCords 再有体检记录的情况下查询所有的体检记录的信息")
    @RequestMapping(value = "/findClinicreCords", method = RequestMethod.GET)
    public ResponseData<List<ClinicreCords>> findClinicreCords() {

        return healthService.findClinicreCords();
    }

    @ApiOperation(value = "/upClinicreCords 修改门诊记录信息")
    @RequestMapping(value = "/upClinicreCords", method = RequestMethod.GET)
    public ResponseData<Map> upClinicreCords(int id,String attendees,String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription) {

        return healthService.upClinicreCords(id,attendees, clinictime, hospital, epartmene, doname, diagnosis, diseasedescription);
    }



    @ApiOperation(value = "/addMedical 再没有体检记录的情况下添加体检记录的信息")
    @RequestMapping(value = "/addMedical", method = RequestMethod.GET)
    public ResponseData<Map> addMedical(String attendees, String medicaltime, String medicalinstitution, String reportname) {

        return healthService.addMedical(attendees, medicaltime, medicalinstitution, reportname);
    }
    @ApiOperation(value = "/findMedical 再有体检记录的情况下查询所有的体检记录的信息")
    @RequestMapping(value = "/findMedical", method = RequestMethod.GET)
    public ResponseData<List<BuyMed>> findMedical() {

        return healthService.findBuyMed();
    }

    @ApiOperation(value = "/delMedical 通过ID删除体检记录信息")
    @RequestMapping(value = "/delMedical", method = RequestMethod.GET)
    public ResponseData<Map> delMedical(Integer id) {

        return healthService.delMedical(id);

    }
    @ApiOperation(value = "/upMedical 再没有体检记录的情况下添加体检记录的信息")
    @RequestMapping(value = "/upMedical", method = RequestMethod.GET)
    public ResponseData<Map> upMedical(int id,String attendees, String medicaltime, String medicalinstitution, String reportname) {

        return healthService.upMedical(id,attendees, medicaltime, medicalinstitution, reportname);
    }
}