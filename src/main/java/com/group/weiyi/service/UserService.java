package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.entity.User;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface UserService extends IService<User> {
    ResponseData<String> loginCode(String phone);


    ResponseData<Integer> login(String phone, int code);

    ResponseData<User> UserDetails(int id);
}
