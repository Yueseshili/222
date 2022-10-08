package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Cooperation;
import com.group.weiyi.entity.ResponseData;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author group
 * @since 2022-10-04
 */
public interface CooperationService extends IService<Cooperation> {

    ResponseData<String> addAdvertising(String companyname, String name, String position, int phone, String intention);

    ResponseData<String> addCompany(String companyname, String name, String position, int phone, String intention);

    ResponseData<String> addDrugstore(String companyname, String name, String position, int phone, String intention);

    ResponseData<String> addHospital(String hospitalname, String hospitaltype, String name, String position, int phone, String intention);

    ResponseData<String> addPatientNum(String companyname, String name, String position, int phone, String intention);


    ResponseData<String> addLive(String companyname, String name, String position, int phone, String intention);


    ResponseData<String> addRecruit(String hospitalname, String hospitaltype, String name, String position, int phone, String intention);

}
