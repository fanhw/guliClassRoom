package com.fhw.guliclassroom.common.practice.exception;

import com.fhw.guliclassroom.common.practice.enums.BusinessMsgEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 17:34
 */


public class BusinessErrorException extends RuntimeException {

    private static final long serialVersionUID = 5623069063660662914L;

    /**
     * 异常码
     */
    @Getter
    @Setter
    private String code;
    /**
     * 异常提示信息
     */
    @Getter
    @Setter
    private String message;


    public BusinessErrorException() {
    }

    public BusinessErrorException(BusinessMsgEnum businessMsgEnum) {
        this.code = businessMsgEnum.getCode();
        this.message = businessMsgEnum.getMsg();
    }

    public BusinessErrorException(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
