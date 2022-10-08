package com.group.weiyi.controller;


import com.group.weiyi.entity.Product;
import com.group.weiyi.entity.ResponseData;
import com.group.weiyi.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品 前端控制器
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
@Api(tags = "商品接口",description = "展示商品信息")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ApiOperation(value = "/queryProduct 查询商品")
    @RequestMapping(value = "/queryProduct", method = RequestMethod.POST)
    public ResponseData<List<Product>> queryProduct(int id) {
        return productService.queryProduct(id);
    }
}

