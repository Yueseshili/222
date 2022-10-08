package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Item;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.entity.User;
import com.group.weiyi.mapper.ItemMapper;
import com.group.weiyi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public ResponseData<List<Item>> queryItem(int id) {
        ResponseData<List<Item>> responseData = new ResponseData<>();
        List<Item> queryItem = itemMapper.queryItem(id);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setData(queryItem);
        return responseData;
    }

    @Override
    public ResponseData<String> addItem(int id,String name, String type, String num, float count, String createtime, String address, User u_id) {
        boolean addItem = itemMapper.addItem(id,name,type,num,count,createtime,address,u_id);
        ResponseData<String> responseData = new ResponseData<>();
        if (true) {
            responseData.setCode(0);
            responseData.setMsg("success");
        } else {
            responseData.setCode(1);
            responseData.setMsg("fail");
        }
        return responseData;

    }

    @Override
    public ResponseData<String> deleteItem(int id) {
        boolean flag = itemMapper.deleteItem(id);
        ResponseData<String> responseData = new ResponseData<>();
        if (true) {
            responseData.setCode(0);
            responseData.setMsg("success");
            return responseData;
        }
        responseData.setCode(1);
        responseData.setMsg("fail");
        return responseData;
    }
}
