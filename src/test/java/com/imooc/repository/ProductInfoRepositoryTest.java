package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author HHL
 * @description
 *      商品信息dao接口测试
 * @date 2018/8/19 - 13:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;


    @Test
    public void saveTest() {

        ProductInfo productInfo = new ProductInfo();

        productInfo.setProductId("123457");
        productInfo.setProductName("PiDanZhou");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("Good Tastes");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(6);

        ProductInfo result = repository.save(productInfo);
        System.out.println(result);
    }


    @Test
    public void findAll() {

        List<ProductInfo>  productInfos = repository.findAll();
        System.out.println(productInfos);
    }

    @Test
    public void findByProductStatus() {

        List<ProductInfo>  productInfos =  repository.findByProductStatus(0);
        System.out.println(productInfos);
    }
}