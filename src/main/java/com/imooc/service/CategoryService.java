package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by 廖师兄
 * 2017-05-09 10:12
 */
public interface CategoryService {

    /** 查询一条记录 */
    ProductCategory findOne(Integer categoryId);

    /** 查询所有记录 */
    List<ProductCategory> findAll();


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /** 新增或者更新记录 */
    ProductCategory save(ProductCategory productCategory);
}
