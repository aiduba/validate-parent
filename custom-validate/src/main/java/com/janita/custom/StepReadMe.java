package com.janita.custom;

/**
 * Created by Janita on 2017-05-22 20:14
 */
public class StepReadMe {

    /**
     * 一.前面几步见 validate-one
     *
     * 二.自定义校验规则步骤
     *
     * 1.创建一个自定义注解
     * @see com.janita.custom.annotation.JsonArray
     * 表示约束一个参数的格式必须是 JSON 数组的格式
     *
     * 2.为这个自定义约束创建一个解析类
     * @see com.janita.custom.parser.JsonArrayValidator
     * 验证这个约束的具体实现
     *
     * 3.在创建入参bean的时候，在相应的字段上使用 @JsonArray 注解即可
     *
     * 4.后面的步骤跟 validate-one 的类似了
     */
}
