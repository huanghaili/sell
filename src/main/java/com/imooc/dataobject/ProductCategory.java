package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Created by 廖师兄
 * 2017-05-07 14:30
 */

/** 将数据库映射成对象*/
@Entity

/** 动态更新，使数据库自动更新更新时间 */
@DynamicUpdate

/**
 * 使用 @Data、@Getter、@Setter 自动生成相应方法，需要在pom.xml中引入lombok依赖
 * @Data 使当前类自动生成 getter()、setter()、toString()方法
 * 如果只需要当前类生成getter()方法，则将 @Data 改为 @Getter
 * 如果只需要当前类生成setter()方法，则将 @Data 改为 @Setter
 * */
@Data
public class ProductCategory {

    /** 类目id. */
    @Id  // 主键
    @GeneratedValue  // 自增
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;


    /**
     * 使用 ProductCategoryRepository接口的 这个 findByCategoryTypeIn(List<Integer> categoryTypeList)
     * 方法时，需要实体类有一个无参构造方法。
     */
    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
