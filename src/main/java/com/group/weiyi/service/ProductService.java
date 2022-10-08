package com.group.weiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group.weiyi.entity.Product;
import com.group.weiyi.entity.ResponseData;

import java.util.List;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ProductService extends IService<Product> {

    ResponseData<List<Product>> queryProduct(int id);
}
