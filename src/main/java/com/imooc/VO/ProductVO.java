package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author HHL
 * @description
 *      商品(包含类目),前端要什么字段就应只返回什么字段
 * @date 2018/8/19 - 15:45
 */
@Data
public class ProductVO {

    /**
     * categoryName 类目名，
     * @JsonProperty("name") 表示返回给浏览器的数据
     * 以 name 显示而不是以其真实字段 categoryName
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * categoryType 商品类型，
     * @JsonProperty("type") 表示返回给浏览器的数据
     * 以 type 显示而不是以其真实字段 categoryType
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * productInfoVOList 商品类型，
     * @JsonProperty("foods") 表示返回给浏览器的数据
     * 以 foods 显示而不是以其真实字段 productInfoVOList
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
