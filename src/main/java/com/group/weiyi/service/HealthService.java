package com.group.weiyi.service;

import com.group.weiyi.entity.*;

import java.util.List;
import java.util.Map;

public interface HealthService {

    ResponseData<List<Doctor>> findAllInfoInQuiry(String input);

    ResponseData<Map> addPatient(String name,String idcard,String sex,Integer age,String phone,String status);

    ResponseData<Map> addBuyMed(String buyname,String buytime,String buyplace,String medname,Integer mednumber);

    ResponseData<List<BuyMed>> findBuyMed();

    ResponseData<Map> addClinicreCords(String attendees, String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription);

    ResponseData<Map> addMedical(String attendees, String medicaltime, String medicalinstitution, String reportname);

    ResponseData<List<MedicalRecord>> findMedical();

    ResponseData<List<ClinicreCords>> findClinicreCords();

    ResponseData<Map> delPatient(Integer id);

    ResponseData<Map> delBuyMed(Integer id);

    ResponseData<Map> delClinicreCords(Integer id);

    ResponseData<Map> delMedical(Integer id);

    ResponseData<Map> upBuyMed(int id,String buyname,String buytime,String buyplace,String medname,Integer mednumber);

    ResponseData<Map> upClinicreCords(int id,String attendees, String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription);

    ResponseData<Map> upMedical(int id,String attendees, String medicaltime, String medicalinstitution, String reportname);
}
