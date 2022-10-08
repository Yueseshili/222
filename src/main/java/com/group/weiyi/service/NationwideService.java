package com.group.weiyi.service;

import com.group.weiyi.entity.Consultationnotes;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.Hospital;
import com.group.weiyi.entity.ResponseData;

import java.util.List;
import java.util.Map;

/**
 * 全过界面实现
 */
public interface NationwideService {
    ResponseData<List<Map>> findAllInfo(String input);

    ResponseData<List<Doctor>> findDoctor();

    ResponseData<List<Hospital>> findHospital();

    ResponseData<List<Doctor>> findLocalDoctor();

    ResponseData<List<Hospital>> findLocalHospital();

    ResponseData<List<Doctor>> findAllInfoDoctor(String input);

    ResponseData<List<Hospital>> findAllInfoHospital(String input);

    ResponseData<List<Consultationnotes>> findAllInfoConsultationnotes(String input);

}
