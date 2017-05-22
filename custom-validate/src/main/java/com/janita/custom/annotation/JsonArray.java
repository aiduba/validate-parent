package com.janita.custom.annotation;

import com.janita.custom.parser.JsonArrayValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Janita on 2017-05-22 20:16
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = {JsonArrayValidator.class})
public @interface JsonArray {

    String message() default "{is.not.json}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
