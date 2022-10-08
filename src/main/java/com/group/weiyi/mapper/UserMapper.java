package com.group.weiyi.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.User;



/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface UserMapper extends BaseMapper<User> {


    User findUserByPhone(String phone);

    int addUserByPhone(String phone,String name,int code);

    int updateUser(User user);

    int findUserByPhoneAndCode(String phone, int code);

    User findUserById(int id);
}
