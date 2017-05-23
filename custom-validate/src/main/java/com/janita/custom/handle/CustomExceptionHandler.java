package com.janita.custom.handle;

import com.janita.common.result.Result;
import com.janita.common.result.ResultUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Janita on 2017-05-22 20:05
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    /**
     * 参数校验异常处理
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handleMethodArgumentNotValid(MethodArgumentNotValidException exception) throws Exception {

        //按需重新封装需要返回的错误信息
        List<String> invalidArguments = new ArrayList<>();
        for (FieldError error : exception.getBindingResult().getFieldErrors()) {
            invalidArguments.add(error.getDefaultMessage());
        }

        return ResultUtils.error(invalidArguments.toString().replaceAll("\\[" , "").replaceAll("]", ""), -1);
    }
}
