package com.group.weiyi.mapper;

import com.group.weiyi.entity.BuyMed;
import com.group.weiyi.entity.ClinicreCords;
import com.group.weiyi.entity.Doctor;
import com.group.weiyi.entity.MedicalRecord;

import java.util.List;

/**
 * 健康模块下的健康记录仪功能模块
 *
 *
 * @author group
 * @since 2022-10-03
 */

public interface HealthMapper {
    List<Doctor> findAllInfoInQuiry(String input);

   Boolean addPatient(String name,String idcard,String sex,Integer age,String phone,String status);

    Boolean addBuyMed(String buyname,String buytime,String buyplace,String medname,Integer mednumber);

    List<BuyMed> findBuyMed();

    Boolean addClinicreCords(String attendees, String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription);

    Boolean addMedical(String attendees, String medicaltime, String medicalinstitution, String reportname);

    List<MedicalRecord> findMedical();

    Boolean delPatient(Integer id);

    Boolean delBuyMed(Integer id);

    Boolean delClinicreCords(Integer id);

    Boolean delMedical(Integer id);

    Boolean upBuyMed(int id,String buyname,String buytime,String buyplace,String medname,Integer mednumber);

    List<ClinicreCords> findClinicreCords();

    Boolean upClinicreCords(int id,String attendees,String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription);

    Boolean upMedical(int id,String attendees, String medicaltime, String medicalinstitution, String reportname);
}
