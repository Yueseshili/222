package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Registration;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 挂号 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface RegistrationMapper extends BaseMapper<Registration> {

    List<Registration> queryRegistration(int id);

    boolean deleteRegistration(int id);

    boolean addRegistration(@Param("u_id") int u_id, @Param("doctor_id") int doctor_id);
}
