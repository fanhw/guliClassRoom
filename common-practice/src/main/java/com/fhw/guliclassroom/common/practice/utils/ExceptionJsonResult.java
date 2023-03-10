package com.fhw.guliclassroom.common.practice.utils;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 10:39
 */


public class ExceptionJsonResult {
    /**
     * 异常码
     */
    protected String code;

    /**
     * 异常信息
     */
    protected String msg;


    public ExceptionJsonResult() {
        this.code = "200";
        this.msg = "操作成功";
    }

    public ExceptionJsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
