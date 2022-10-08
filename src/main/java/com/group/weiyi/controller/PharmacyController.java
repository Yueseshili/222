package com.group.weiyi.controller;


import com.group.weiyi.entity.Item;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 药房 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "药店接口", description = "展示用户在药店买的药品")
@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
    @Autowired
    private ItemService itemService;

    @ApiOperation(value = "/queryItem 查询订单")
    @RequestMapping(value = "/queryItem", method = RequestMethod.POST)
    public ResponseData<List<Item>> queryItem(int id) {
        return itemService.queryItem(id);
    }

}

