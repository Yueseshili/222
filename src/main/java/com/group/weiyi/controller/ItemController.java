package com.group.weiyi.controller;


import com.group.weiyi.entity.Item;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.entity.User;
import com.group.weiyi.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 * 订单 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "订单接口",description = "我的发票功能中展示订单发票")
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @ApiOperation(value = "/queryItem 查询订单")
    @RequestMapping(value = "/queryItem", method = RequestMethod.POST)
    public ResponseData<List<Item>> queryItem(int id) {
        return itemService.queryItem(id);
    }

    @ApiOperation(value = "/addItem 添加订单")
    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public ResponseData<String> addItem(int id,String name, String type, String num, float count, String createtime, String address, HttpSession session) {
        User  u_id = (User) session.getAttribute("u_id");
        return itemService.addItem(id,name,type,num,count,createtime,address,u_id);
    }

    @ApiOperation(value = "/deleteItem 删除订单")
    @RequestMapping(value = "/deleteItem",method = RequestMethod.POST)
    public ResponseData<String> deleteItem(int id) {
        return itemService.deleteItem(id);
    }

}

