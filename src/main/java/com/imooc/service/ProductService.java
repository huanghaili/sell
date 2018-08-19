package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author HHL
 * @description
 *      商品信息服务接口
 * @date 2018/8/19 - 14:14
 */
public interface ProductService {

    /** 根据商品id查询商品信息 */
    ProductInfo findOne(String productId);

    /** 查询所有在架商品列表 */
    List<ProductInfo> findUpAll();

    /** 分页查询所有商品  */
    Page<ProductInfo> findAll(Pageable pageable);

    /** 添加商品信息 */
    public ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存

    //上架

    //下架
}
