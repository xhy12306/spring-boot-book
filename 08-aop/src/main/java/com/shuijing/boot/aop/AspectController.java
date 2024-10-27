package com.shuijing.boot.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-06-14
 */
@Slf4j
@RestController
@RequestMapping("/aspect")
public class AspectController {

    @GetMapping
    public Result<String> aspect(String message) {
        log.info("aspect controller");
        return Result.success(message);
    }

    @GetMapping("/exception")
    public Result<Boolean> exception() {
        throw new RuntimeException("runtime exception");
    }

    @GetMapping("/sleep/{time}")
    public Result<String> sleep(@PathVariable("time") long time) {
        log.info("sleep");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            log.error("error",e);
        }
        if (time == 1000) {
            throw new RuntimeException("runtime exception");
        }
        return Result.success("wake up");
    }
}