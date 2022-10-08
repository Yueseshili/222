package com.group.weiyi.controller;


import com.group.weiyi.entity.Registration;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.RegistrationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 挂号 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "挂号接口",description = "对挂号的相关操作")
@RestController
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @ApiOperation(value = "/queryRegistration 查询挂号信息")
    @RequestMapping(value = "/queryRegistration", method = RequestMethod.POST)
    public ResponseData<List<Registration>> queryRegistration(int id) {
        return registrationService.queryRegistration(id);
    }
    @ApiOperation(value = "/deleteRegistration 删除挂号信息")
    @RequestMapping(value = "/deleteRegistration",method = RequestMethod.POST)
    public ResponseData<String> deleteRegistration(int id) {
        ResponseData<String> responseData = new ResponseData<>();
        return registrationService.deleteRegistration(id);
    }
    @ApiOperation(value = "/addRegistration 添加挂号信息")
    @RequestMapping(value = "/addRegistration",method = RequestMethod.POST)
    public ResponseData<String> addRegistration(int u_id,int doctor_id) {
        return registrationService.addRegistration(u_id,doctor_id);
    }

}

