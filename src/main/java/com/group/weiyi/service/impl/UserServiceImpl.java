package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.entity.User;
import com.group.weiyi.mapper.UserMapper;
import com.group.weiyi.service.UserService;
import com.group.weiyi.utils.AliSmsUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseData<String> loginCode(String phone) {
        ResponseData<String> responseData = new ResponseData<>();
        int code = AliSmsUtil.randomNum(6);
        System.out.println("code = " + code);
        // 发送随机验证码
        AliSmsUtil.sendSmsCode(phone, code + "", AliSmsUtil.SMS_TEM_LOGIN);
        User user = userMapper.findUserByPhone(phone);
        if (user != null) {
            user.setCode(code);
            int num = userMapper.updateUser(user);
            System.out.println("num = " + num);
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData("发送成功");
        } else {
            String name ="用户wy" + RandomStringUtils.randomNumeric(5);
            int num = userMapper.addUserByPhone(phone,name,code);
            if (num > 0) {
                responseData.setCode(0);
                responseData.setMsg("success");
                responseData.setData("发送成功");
            }else {
                responseData.setCode(1);
                responseData.setMsg("fail");
                responseData.setData("发送失败");
            }
        }
        return responseData;
    }

    @Override
    public ResponseData<Integer> login(String phone, int code) {
        ResponseData<Integer> responseData = new ResponseData<>();
        int num = userMapper.findUserByPhoneAndCode(phone,code);
        if (num > 0) {
            responseData.setCode(0);
            responseData.setMsg("success");
            User user = userMapper.findUserByPhone(phone);
            Integer id = user.getId();
            responseData.setData(id);
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");

        }
        return responseData;
    }

    @Override
    public ResponseData<User> UserDetails(int id) {
        ResponseData<User> responseData = new ResponseData<>();
        User user = userMapper.findUserById(id);
        if (user != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(user);
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }
}
