package com.shuijing.boot.exception.controller;

import com.shuijing.boot.exception.common.ApiException;
import com.shuijing.boot.exception.common.MessageEnum;
import com.shuijing.boot.exception.common.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @since 2021-06-06
 */
@RestController
@RequestMapping("/exception")
@Api(value = "异常",tags = "异常")
public class ExceptionController {

    @GetMapping("/apiexception")
    public Result<Boolean> apiException() {
        throw new ApiException(MessageEnum.ERROR);
    }

    @GetMapping("/runtimeexception")
    public Result<Boolean> runtimeException() {
        throw new RuntimeException();
    }
}