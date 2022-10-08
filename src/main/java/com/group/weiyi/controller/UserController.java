package com.group.weiyi.controller;


import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.entity.User;
import com.group.weiyi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "用户模块接口", description = "关于用户的接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "/LoginCode 发送验证码")
    @RequestMapping(value = "/LoginCode", method = RequestMethod.POST)
    public ResponseData<String> LoginCode(String phone) {

        return userService.loginCode(phone);
    }
    @ApiOperation(value = "/Login 登录")
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public ResponseData<Integer> Login(String phone, int code) {
        return userService.login(phone,code);
    }
    @ApiOperation(value = "/UserDetails 用户详细信息")
    @RequestMapping(value = "/UserDetails", method = RequestMethod.POST)
    public ResponseData<User> UserDetails(int id){
        return userService.UserDetails(id);
    }

}

