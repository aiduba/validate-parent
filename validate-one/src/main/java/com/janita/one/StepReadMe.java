package com.janita.one;

/**
 * Created by Janita on 2017-05-22 19:44
 */
public class StepReadMe {

    /**
     *
     * 一：使用入参验证的步骤
     *
     * 1.spring-boot-starter-web
     * @NotBlank,@Email@Length等验证用的注解在此依赖中
     *
     * 2.定义controller入参封装对象，如UserBean
     * @see com.janita.one.bean.UserBean
     * 在属性上加上验证注解
     *
     *
     * 3.写controller,方法入参为 UserBean ，
     * 且参数前加上 @Validated 表示此入参对象需要进行校验
     *
     * 4.启动项目，通过swagger测试即可
     * 当入参验证不通过时，控制台不会报错，直接在页面显示业务错误信息，
     * 但是这样的错误提示不统一
     *
     * 5.统一处理验证不通过异常 MethodArgumentNotValidException
     * @see org.springframework.web.bind.MethodArgumentNotValidException
     */
}
