package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Hospital;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 医院 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface HospitalService extends IService<Hospital> {

    ResponseData<List<Hospital>> selectAllHospital();

    ResponseData<String> addHospital(Hospital hospital);
}
