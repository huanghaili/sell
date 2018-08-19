package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 廖师兄
 * 2017-05-07 14:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    /** 注入接口 */
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {  // JpaRepository接口里的方法
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }



//    @Test
//    public void saveAddTest() {  // JpaRepository接口里的方法
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("women");
//        productCategory.setCategoryType(3);
//        repository.save(productCategory);
//    }



    @Test

    /**
     *
     * 测试修改
     *
     * 使用事务，使测试数据不出现在数据库，跟我们在service使用的事务有一些不一样
     * service事务时出现异常时，回滚操作
     * 而在Test这里使用事务，则会完全回滚，不论做什么操作，数据都不会进入数据库
     * */
    @Transactional
    public void saveTest() {  // JpaRepository接口里的方法
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }


    /**
     * 使用 ProductCategoryRepository 接口的这个 findByCategoryTypeIn(List<Integer> categoryTypeList)
     * 方法时，需要实体类有一个无参构造方法。
     */
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void updateTest() {
//        ProductCategory productCategory = repository.findOne(4);
//        productCategory.setCategoryName("男生最爱1");
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertEquals(productCategory, result);
    }
}