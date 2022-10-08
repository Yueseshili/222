package com.group.weiyi.controller;

import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.Hospital;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.NationwideService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@Api(tags = "全国模块接口",description = "关于全国界面的接口")
@RestController
@RequestMapping("/nation")
public class NationwideController {
    @Autowired
    private NationwideService nationwideService;

    /**
     * 全国界面搜索框功能实现
     * @param input 用户模糊查询字段
     * @return 查询结果
     */
    @ApiOperation(value = "/findAllInfo 全国界面搜索框功能实现")
    @RequestMapping(value = "/findAllInfo",method = RequestMethod.GET)
    public ResponseData<List<Map>> findAllInfo(String input){

        return nationwideService.findAllInfo(input);
    }

    /**
     * 查询所有医生功能
     * @return
     */
    @ApiOperation(value = "/findDoctor 查询所有医生功能")
    @RequestMapping(value = "/findDoctor",method = RequestMethod.GET)
    public ResponseData<List<Doctor>> findDoctor(){

        return nationwideService.findDoctor();
    }

    /**
     * 查询所有医院功能
     * @return
     */
    @ApiOperation(value = "/findHospital 查询所有医院功能")
    @RequestMapping(value = "/findHospital",method = RequestMethod.GET)
    public ResponseData<List<Hospital>> findHospital(){

        return nationwideService.findHospital();
    }

    /**
     * 查询本地医生功能
     * @return
     */
    @ApiOperation(value = "/findLocalDoctor 查询本地医生功能")
    @RequestMapping(value = "/findLocalDoctor",method = RequestMethod.GET)
    public ResponseData<List<Doctor>> findLocalDoctor(){

        return nationwideService.findLocalDoctor();
    }

    /**
     * 查询本地医院功能
     * @return
     */
    @ApiOperation(value = "/findLocalHospital 查询本地医院功能")
    @RequestMapping(value = "/findLocalHospital",method = RequestMethod.GET)
    public ResponseData<List<Hospital>> findLocalHospital(){

        return nationwideService.findLocalHospital();
    }

}
