package com.group.weiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group.weiyi.entity.Product;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.mapper.ProductMapper;
import com.group.weiyi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Override
    public ResponseData<List<Product>> queryProduct(int id) {
        ResponseData<List<Product>> responseData = new ResponseData<>();
        List<Product> queryProduct = productMapper.queryProduct(id);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setData(queryProduct);
        return responseData;
    }
}
