package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Clinic;

import java.util.List;

/**
 * <p>
 * 门诊 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ClinicMapper extends BaseMapper<Clinic> {

    List<Clinic> selectClinicByHospitalAndEpartmene(int h_id,int e_id);
}
