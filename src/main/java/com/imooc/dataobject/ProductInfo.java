package com.imooc.dataobject;

/**
 * @author HHL
 * @description
 *      商品信息实体类
 * @date 2018/8/19 - 12:47
 */

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

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
public class ProductInfo {


    @Id
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;


}
