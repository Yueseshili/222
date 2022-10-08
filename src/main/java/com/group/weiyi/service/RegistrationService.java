package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Registration;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 挂号 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface RegistrationService extends IService<Registration> {

    ResponseData<List<Registration>> queryRegistration(int id);

    ResponseData<String> deleteRegistration(int id);

    ResponseData<String> addRegistration(int u_id, int doctor_id);
}
