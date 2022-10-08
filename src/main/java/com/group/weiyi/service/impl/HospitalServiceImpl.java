package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Hospital;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.HospitalMapper;
import com.group.weiyi.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 医院 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalMapper, Hospital> implements HospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;
    @Override
    public ResponseData<List<Hospital>> selectAllHospital() {
        ResponseData<List<Hospital>> responseData = new ResponseData();
        List<Hospital> list = hospitalMapper.selectAllHospital();
        if (list != null){
            responseData.setData(list);
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }

        return responseData;
    }

    @Override
    public ResponseData<String> addHospital(Hospital hospital) {

        ResponseData<String> responseData = new ResponseData();
        if (hospitalMapper.addHospital(hospital)){
            responseData.setData("添加成功");
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setData("添加失败");
            responseData.setCode(1);
            responseData.setMsg("fail");
        }

        return responseData;
    }
}
