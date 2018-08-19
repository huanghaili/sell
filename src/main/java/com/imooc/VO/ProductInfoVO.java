package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author HHL
 * @description
 *      商品详情,前端要什么字段就应只返回什么字段
 * @date 2018/8/19 - 16:13
 */

@Data
public class ProductInfoVO {

    /**
     * productId 商品id，
     * @JsonProperty("id") 表示返回给浏览器的数据
     * 以 id 显示而不是以其真实字段 productId
     */
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
