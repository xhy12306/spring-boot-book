package com.shuijing.boot.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2020/11/29
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    private LogInterceptor logInterceptor;
//    @Autowired
//    private TimeInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor);
//        registry.addInterceptor(timeInterceptor);
    }
}
