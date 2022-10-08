package com.group.weiyi.controller;


import com.group.weiyi.entity.Mycollection;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.MycollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "收藏接口",description = "收藏相关的各种功能")
@RestController
@RequestMapping("/mycollection")
public class MycollectionController {
    @Autowired
    private MycollectionService mycollectionService;
    /**
     * 查询医生
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "/queryMycollection 查询医生、医院、科室、门诊、商品等信息")
    @RequestMapping(value = "/queryMycollection", method = RequestMethod.POST)
    public ResponseData<List<Mycollection>> queryMycollection(int id) {
        return mycollectionService.queryMycollection(id);
    }
    @ApiOperation(value = "/deleteMycollection 删除收藏")
    @RequestMapping(value = "/deleteMycollection",method = RequestMethod.POST)
    public ResponseData<String> deleteMycollection(int id) {
        ResponseData<String> responseData = new ResponseData<>();
        return mycollectionService.deleteMycollection(id);
    }
    @ApiOperation(value = "/addMycollection 添加收藏")
    @RequestMapping(value = "/addMycollection",method = RequestMethod.POST)
    public ResponseData<String> addMycollection(String doctor, String hospital, String product, String illness, String epartmene) {
        return mycollectionService.addMycollection(doctor,epartmene,hospital,illness,product);
    }
}

