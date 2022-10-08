package com.group.weiyi.controller;


import com.group.weiyi.entity.Consultation;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.ConsultationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 问诊表 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "问诊订单接口",description = "此功能不太健全")
@RestController
@RequestMapping("/consultation")
public class ConsultationController {
    @Autowired
    private ConsultationService consultationService;

    @ApiOperation(value = "/queryConsultation 查询问诊订单信息")
    @RequestMapping(value = "/queryConsultation", method = RequestMethod.POST)
    public ResponseData<List<Consultation>> queryConsultation(int id) {
        return consultationService.queryConsultation(id);
    }
    @ApiOperation(value = "/deleteConsultation 删除问诊信息")
    @RequestMapping(value = "/deleteConsultation",method = RequestMethod.POST)
    public ResponseData<String> deleteConsultation(int id) {
        ResponseData<String> responseData = new ResponseData<>();
        return consultationService.deleteConsultation(id);
    }
    @ApiOperation(value = "/addConsultation 添加问诊信息")
    @RequestMapping(value = "/addConsultation",method = RequestMethod.POST)
    public ResponseData<String> addConsultation(String type) {
        return consultationService.addConsultation(type);
    }
}

