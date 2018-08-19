package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author HHL
 * @description
 *      商品信息dao接口
 * @date 2018/8/19 - 13:04
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findAll();

    List<ProductInfo> findByProductStatus(Integer productStatus);

}
