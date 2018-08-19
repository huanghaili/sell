package com.imooc.enums;

import lombok.Generated;
import lombok.Getter;

/**
 * @author HHL
 * @description
 *     商品上下架状态码
 * @date 2018/8/19 - 14:09
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
