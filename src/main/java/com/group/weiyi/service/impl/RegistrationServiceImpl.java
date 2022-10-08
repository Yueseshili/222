package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Registration;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.RegistrationMapper;
import com.group.weiyi.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 挂号 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class RegistrationServiceImpl extends ServiceImpl<RegistrationMapper, Registration> implements RegistrationService {
    @Autowired
    private RegistrationMapper registrationMapper;

    @Override
    public ResponseData<List<Registration>> queryRegistration(int id) {
        ResponseData<List<Registration>> responseData = new ResponseData<>();
        List<Registration> queryRegistration = registrationMapper.queryRegistration(id);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setData(queryRegistration);
        return responseData;
    }

    @Override
    public ResponseData<String> deleteRegistration(int id) {
        boolean flag = registrationMapper.deleteRegistration(id);
        ResponseData<String> responseData = new ResponseData<>();
        if (true) {
            responseData.setCode(0);
            responseData.setMsg("success");
            return responseData;
        }
        responseData.setCode(1);
        responseData.setMsg("fail");
        return responseData;
    }

    @Override
    public ResponseData<String> addRegistration(int u_id, int doctor_id) {
        boolean addRegistration = registrationMapper.addRegistration(u_id,doctor_id);
        ResponseData<String> responseData = new ResponseData<>();
        if (true) {
            responseData.setCode(0);
            responseData.setMsg("success");
        } else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }
}
