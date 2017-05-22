package com.janita.custom.controller;

import com.janita.common.result.Result;
import com.janita.common.result.ResultUtils;
import com.janita.custom.bean.ThingBean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-05-22 20:29
 */
@RestController
@RequestMapping("/thing")
public class ThingController {

    @PostMapping
    public Result createThing (@Validated @RequestBody ThingBean thingBean) {
        return ResultUtils.success(thingBean);
    }

}
