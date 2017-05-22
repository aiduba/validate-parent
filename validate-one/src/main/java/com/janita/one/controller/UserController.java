package com.janita.one.controller;

import com.janita.common.result.Result;
import com.janita.common.result.ResultUtils;
import com.janita.one.bean.UserBean;
import com.janita.one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-05-22 19:48
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result createUser (@Validated @RequestBody UserBean userBean) {

        UserBean bean = userService.createUser(userBean);

        return ResultUtils.success(bean);
    }
}
