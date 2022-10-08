package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Hospital;

import java.util.List;

/**
 * <p>
 * 医院 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface HospitalMapper extends BaseMapper<Hospital> {
    List<Hospital> selectAllHospital();

    boolean addHospital(Hospital hospital);
}
