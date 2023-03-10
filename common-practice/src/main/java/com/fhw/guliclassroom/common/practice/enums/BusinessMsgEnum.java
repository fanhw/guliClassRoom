package com.fhw.guliclassroom.common.practice.enums;

import lombok.Getter;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 17:31
 */


public enum BusinessMsgEnum {
    SUCCESS("200", "成功"),
    /**
     * 参数异常
     */
    PARMETER_EXCEPTION("102", "参数异常!"),
    /**
     * 等待超时
     */
    SERVICE_TIME_OUT("103", "服务调用超时！"),
    /**
     * 参数过大
     */
    PARMETER_BIG_EXCEPTION("102", "输入的图片数量不能超过50张!"),
    /**
     * 500 : 一劳永逸的提示也可以在这定义
     */
    UNEXPECTED_EXCEPTION("500", "系统发生异常，请联系管理员！");
    // 还可以定义更多的业务异常

    /**
     * 消息码
     */
    @Getter
    private String code;
    /**
     * 消息内容
     */
    @Getter
    private String msg;

    BusinessMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
