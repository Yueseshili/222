package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Mycollection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface MycollectionMapper extends BaseMapper<Mycollection> {

    List<Mycollection> queryMycollection(int id);

    boolean deleteMycollection(int id);

    boolean addMycollection(@Param("doctor") String doctor, @Param("epartmene") String epartmene, @Param("hospital") String hospital, @Param("illness") String illness, @Param("product") String product);
}
