package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Consultation;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 问诊表 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ConsultationService extends IService<Consultation> {

    ResponseData<List<Consultation>> queryConsultation(int id);

    ResponseData<String> deleteConsultation(int id);


    ResponseData<String> addConsultation(String type);

}
