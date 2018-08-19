package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-05-07 14:35
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 使用 ProductCategoryRepository 接口的这个 findByCategoryTypeIn(List<Integer> categoryTypeList)
     * 方法时，需要实体类有一个无参构造方法。
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
