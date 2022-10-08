package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Clinic;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.ClinicMapper;
import com.group.weiyi.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 门诊 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class ClinicServiceImpl extends ServiceImpl<ClinicMapper, Clinic> implements ClinicService {

    @Autowired
    private ClinicMapper clinicMapper;
    @Override
    public ResponseData<List<Clinic>> selectClinicByHospitalAndEpartmene(int h_id, int e_id) {
        ResponseData<List<Clinic>> responseData = new ResponseData<>();
        List<Clinic> list = clinicMapper.selectClinicByHospitalAndEpartmene(h_id, e_id);
        if (list != null){
            responseData.setCode(0);
            responseData.setData(list);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }
}
