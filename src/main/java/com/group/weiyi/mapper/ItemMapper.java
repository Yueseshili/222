package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Item;
import com.group.weiyi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ItemMapper extends BaseMapper<Item> {

    List<Item> queryItem(int id);

    boolean addItem(@Param("id") int id, @Param("name") String name, @Param("type") String type, @Param("num") String num, @Param("count") float count, @Param("createtime") String createtime, @Param("address") String address, @Param("u_id") User u_id);


    boolean deleteItem(int id);
}
