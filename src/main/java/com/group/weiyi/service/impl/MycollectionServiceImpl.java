package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Mycollection;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.MycollectionMapper;
import com.group.weiyi.service.MycollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class MycollectionServiceImpl extends ServiceImpl<MycollectionMapper, Mycollection> implements MycollectionService {
    @Autowired
    private MycollectionMapper mycollectionMapper;

    @Override
    public ResponseData<List<Mycollection>> queryMycollection(int id) {
        ResponseData<List<Mycollection>> responseData = new ResponseData<>();
        List<Mycollection> mycollection = mycollectionMapper.queryMycollection(id);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setData(mycollection);
        return responseData;
    }

    @Override
    public ResponseData<String> deleteMycollection(int id) {
        boolean flag = mycollectionMapper.deleteMycollection(id);
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
    public ResponseData<String> addMycollection(String doctor, String epartmene, String hospital, String illness, String product) {
        boolean addPatient = mycollectionMapper.addMycollection(doctor,epartmene,hospital,illness,product);
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
