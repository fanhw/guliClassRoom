package com.fhw.guliclassroom.common.practice.exception;

import com.fhw.guliclassroom.common.practice.utils.ExceptionJsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 10:41
 */

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 缺少请求参数异常
     *
     * @param ex HttpMessageNotReadableException
     * @return
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ExceptionJsonResult handleHttpMessageNotReadableException(
            MissingServletRequestParameterException ex) {
        LOGGER.error("缺少请求参数，异常:", ex);
        return new ExceptionJsonResult("400", "缺少必要的请求参数");
    }

    /**
     * 空指针异常
     *
     * @param ex NullPointerException
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionJsonResult handleTypeMismatchException(NullPointerException ex) {
        LOGGER.error("空指针异常:", ex);
        return new ExceptionJsonResult("500", "空指针异常了");
    }

    /**
     * 系统异常 预期以外异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionJsonResult handleUnexpectedServer(Exception ex) {
        LOGGER.error("系统异常：", ex);
        return new ExceptionJsonResult("500", "系统发生异常，请联系管理员");
    }

    /**
     * 拦截业务异常，返回业务异常信息
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(BusinessErrorException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionJsonResult handleBusinessError(BusinessErrorException ex) {
        String code = ex.getCode();
        String message = ex.getMessage();
        LOGGER.error("自定义异常code:{},message:{},ex:", code, message,ex);
        return new ExceptionJsonResult(code, message);
    }
}
