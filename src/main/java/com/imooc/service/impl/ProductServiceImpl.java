package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HHL
 * @description
 *      商品信息服务实现类
 * @date 2018/8/19 - 14:18
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    /** 根据商品id查询商品信息 */
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    /** 查询所有在架商品列表 */
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    /** 分页查询所有商品  */
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    /** 添加商品信息 */
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

}
