package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Consultation;

import java.util.List;

/**
 * <p>
 * 问诊表 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ConsultationMapper extends BaseMapper<Consultation> {

    boolean addConsultation(String type);

    boolean deleteConsultation(int id);

    List<Consultation> queryConsultation(int id);
}
