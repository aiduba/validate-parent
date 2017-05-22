package com.janita.one.handle;

import com.janita.common.result.Result;
import com.janita.common.result.ResultUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * Created by Janita on 2017-05-22 20:05
 */
@RestControllerAdvice
public class ExceptionHandler {

    /**
     * 参数校验异常处理
     * @param exception
     * @return
     * @throws Exception
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handleMethodArgumentNotValid(MethodArgumentNotValidException exception) throws Exception {

        return ResultUtils.error(exception.getMessage(), -1);
    }
}
