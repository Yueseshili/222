package com.group.weiyi.service.impl;

import com.group.weiyi.entity.*;
import com.group.weiyi.mapper.HealthMapper;
import com.group.weiyi.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    private HealthMapper healthMapper;


    @Override
    public ResponseData<List<Doctor>> findAllInfoInQuiry(String input) {
        ResponseData<List<Doctor>> responseData = new ResponseData();
        List<Doctor> allInfoInQuiry = healthMapper.findAllInfoInQuiry(input);
        if (allInfoInQuiry != null){
            responseData.setData(allInfoInQuiry);
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }

        return responseData;
    }

    @Override
    public ResponseData<Map> addPatient(String name, String idcard, String sex, Integer age, String phone, String status) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.addPatient(name, idcard, sex, age, phone, status);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;

    }

    @Override
    public ResponseData<Map> addBuyMed(String buyname, String buytime, String buyplace, String medname, Integer mednumber) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.addBuyMed(buyname, buytime, buyplace, medname, mednumber);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<List<BuyMed>> findBuyMed() {
        ResponseData<List<BuyMed>> responseData = new ResponseData();
        List<BuyMed> buyMed = healthMapper.findBuyMed();
        if (buyMed != null){

            responseData.setData(buyMed);
            responseData.setCode(0);
            responseData.setMsg("success");

        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> addClinicreCords(String attendees, String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.addClinicreCords(attendees, clinictime, hospital, epartmene, doname, diagnosis, diseasedescription);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> addMedical(String attendees, String medicaltime, String medicalinstitution, String reportname) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.addMedical(attendees, medicaltime, medicalinstitution, reportname);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<List<MedicalRecord>> findMedical() {
        ResponseData<List<MedicalRecord>> responseData = new ResponseData();
        List<MedicalRecord> medical = healthMapper.findMedical();
        if (medical != null){
            responseData.setData(medical);
            responseData.setCode(0);
            responseData.setMsg("success");

        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<List<ClinicreCords>> findClinicreCords() {
        ResponseData<List<ClinicreCords>> responseData = new ResponseData();
        List<ClinicreCords> clinicreCords = healthMapper.findClinicreCords();
        if (clinicreCords != null){
            responseData.setData(clinicreCords);
            responseData.setCode(0);
            responseData.setMsg("success");

        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> delPatient(Integer id) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.delPatient(id);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> delBuyMed(Integer id) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.delBuyMed(id);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> delClinicreCords(Integer id) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.delClinicreCords(id);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> delMedical(Integer id) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.delMedical(id);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> upBuyMed(int id,String buyname, String buytime, String buyplace, String medname, Integer mednumber) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.upBuyMed(id,buyname, buytime, buyplace, medname, mednumber);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> upClinicreCords(int id, String attendees, String clinictime, String hospital, String epartmene, String doname, String diagnosis, String diseasedescription) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.upClinicreCords(id, attendees, clinictime, hospital, epartmene, doname, diagnosis, diseasedescription);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }

    @Override
    public ResponseData<Map> upMedical(int id, String attendees, String medicaltime, String medicalinstitution, String reportname) {
        ResponseData<Map> responseData = new ResponseData();
        Boolean aBoolean = healthMapper.upMedical(id,attendees, medicaltime, medicalinstitution, reportname);
        if (aBoolean == true){
            responseData.setCode(0);
            responseData.setMsg("success");
        }else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;
    }
}

