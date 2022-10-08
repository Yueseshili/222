package com.group.weiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group.weiyi.entity.Product;

import java.util.List;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author group
 * @since 2022-10-03
 */
public interface ProductMapper extends BaseMapper<Product> {

    List<Product> queryProduct(int id);
}
