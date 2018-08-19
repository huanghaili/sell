package com.imooc.VO;

import lombok.Data;

/**
 * @author HHL
 * @description
 *      http请求返回的最外层对象即浏览器请求，后台返回的数据
 * @date 2018/8/19 - 15:42
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 后台返回的具体内容. */
    private T data;
}
