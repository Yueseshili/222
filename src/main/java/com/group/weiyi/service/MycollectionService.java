package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Mycollection;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface MycollectionService extends IService<Mycollection> {

    ResponseData<List<Mycollection>> queryMycollection(int id);

    ResponseData<String> deleteMycollection(int id);

    ResponseData<String> addMycollection(String doctor, String epartmene, String hospital, String illness, String product);
}
