package com.group.weiyi.service.impl;

import com.group.weiyi.entity.Consultationnotes;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.Hospital;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.NationwideMapper;
import com.group.weiyi.service.NationwideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class NationwideServiceImpl implements NationwideService {
    @Autowired
    private NationwideMapper nationwideMapper;

    @Override
    public ResponseData<List<Map>> findAllInfo(String input) {
        ResponseData<List<Map>> responseData = new ResponseData<>();

        List<Map> allInfo = nationwideMapper.findAllInfo(input);
        if (allInfo != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(allInfo);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public ResponseData<List<Doctor>> findDoctor() {
        ResponseData<List<Doctor>> responseData = new ResponseData<>();

        List<Doctor> doctor = nationwideMapper.findDoctor();
        if (doctor != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(doctor);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public ResponseData<List<Hospital>> findHospital() {
        ResponseData<List<Hospital>> responseData = new ResponseData<>();

        List<Hospital> hospital = nationwideMapper.findHospital();
        if (hospital != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(hospital);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public  ResponseData<List<Doctor>> findLocalDoctor() {
        ResponseData<List<Doctor>> responseData = new ResponseData<>();

        List<Doctor> localDoctor = nationwideMapper.findLocalDoctor();
        if (localDoctor != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(localDoctor);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public ResponseData<List<Hospital>> findLocalHospital() {
        ResponseData<List<Hospital>> responseData = new ResponseData<>();

        List<Hospital> localHospital = nationwideMapper.findLocalHospital();
        if (localHospital != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(localHospital);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public ResponseData<List<Doctor>> findAllInfoDoctor(String input) {
        ResponseData<List<Doctor>> responseData = new ResponseData<>();

        List<Doctor> allInfoDoctor = nationwideMapper.findAllInfoDoctor(input);
        if (allInfoDoctor != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(allInfoDoctor);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public ResponseData<List<Hospital>> findAllInfoHospital(String input) {
        ResponseData<List<Hospital>> responseData = new ResponseData<>();

        List<Hospital> allInfoHospital = nationwideMapper.findAllInfoHospital(input);
        if (allInfoHospital != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(allInfoHospital);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }

    @Override
    public ResponseData<List<Consultationnotes>> findAllInfoConsultationnotes(String input) {
        ResponseData<List<Consultationnotes>> responseData = new ResponseData<>();

        List<Consultationnotes> allInfoConsultationnotes = nationwideMapper.findAllInfoConsultationnotes(input);
        if (allInfoConsultationnotes != null) {
            responseData.setCode(0);
            responseData.setMsg("success");
            responseData.setData(allInfoConsultationnotes);
            return responseData;
        }

        responseData.setCode(1);
        responseData.setMsg("查询失败");

        return responseData;
    }
}
