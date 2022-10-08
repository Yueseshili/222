package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Consultation;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.ConsultationMapper;
import com.group.weiyi.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 问诊表 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class ConsultationServiceImpl extends ServiceImpl<ConsultationMapper, Consultation> implements ConsultationService {

    @Autowired
    private ConsultationMapper consultationMapper;
    @Override
    public ResponseData<List<Consultation>> queryConsultation(int id) {
        ResponseData<List<Consultation>> responseData = new ResponseData<>();
        List<Consultation> queryConsultation = consultationMapper.queryConsultation(id);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setData(queryConsultation);
        return responseData;
    }

    @Override
    public ResponseData<String> deleteConsultation(int id) {
        boolean flag = consultationMapper.deleteConsultation(id);
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
    public ResponseData<String> addConsultation(String type) {
        boolean addConsultation = consultationMapper.addConsultation(type);
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
