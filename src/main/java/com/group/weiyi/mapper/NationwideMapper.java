package com.group.weiyi.mapper;

import com.group.weiyi.entity.Consultationnotes;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.Hospital;

import java.util.List;
import java.util.Map;

public interface NationwideMapper {
    List<Map> findAllInfo(String input);

    List<Doctor> findDoctor();

    List<Hospital> findHospital();

    List<Doctor> findLocalDoctor();

    List<Hospital> findLocalHospital();

    List<Doctor> findAllInfoDoctor(String input);

    List<Hospital> findAllInfoHospital(String input);

    List<Consultationnotes> findAllInfoConsultationnotes(String input);
}
