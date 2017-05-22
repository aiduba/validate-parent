package com.janita.custom.parser;

import com.alibaba.fastjson.JSON;
import com.janita.custom.annotation.JsonArray;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Janita on 2017-05-22 20:18
 * 校验参数是否是json数组格式的校验器
 */
public class JsonArrayValidator implements ConstraintValidator<JsonArray, Object>{

    @Override
    public void initialize(JsonArray jsonArray) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        String messageTemplate = context.getDefaultConstraintMessageTemplate();
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(messageTemplate).addConstraintViolation();

        if (value == null) {
            return true;
        }

        String str = value.toString();

        try {
            JSON.parseArray(str);
        }catch (Exception e) {
            return false;
        }

        return true;
    }
}
