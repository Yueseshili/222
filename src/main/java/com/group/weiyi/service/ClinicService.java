package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Clinic;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 门诊 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ClinicService extends IService<Clinic> {

    ResponseData<List<Clinic>> selectClinicByHospitalAndEpartmene(int h_id, int e_id);
}
