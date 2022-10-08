package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Item;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.entity.User;

import java.util.List;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ItemService extends IService<Item> {

    ResponseData<List<Item>> queryItem(int id);

    ResponseData<String> addItem(int id,String name, String type, String num, float count, String createtime, String address, User u_id);

    ResponseData<String> deleteItem(int id);
}
