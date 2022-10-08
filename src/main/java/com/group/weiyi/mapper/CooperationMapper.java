package com.group.weiyi.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Cooperation;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-04
 */
public interface CooperationMapper extends BaseMapper<Cooperation> {

    boolean addAdvertising(@Param("companyname") String companyname, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);

    boolean addCompany(@Param("companyname") String companyname, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);

    boolean addDrugstore(@Param("companyname") String companyname, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);

    boolean addHospital(@Param("hospitalname") String hospitalname, @Param("hospitaltype") String hospitaltype, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);

    boolean addPatientNum(@Param("companyname") String companyname, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);

    boolean addLive(@Param("companyname") String companyname, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);


    boolean addRecruit(@Param("hospitalname") String hospitalname, @Param("hospitaltype") String hospitaltype, @Param("name") String name, @Param("position") String position, @Param("phone") int phone, @Param("intention") String intention);

}
