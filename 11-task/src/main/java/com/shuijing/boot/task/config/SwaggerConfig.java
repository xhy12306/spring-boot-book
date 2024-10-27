package com.shuijing.boot.task.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger 配置类
 *
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-5-30
 */
@EnableOpenApi
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot 实战")
                .description("Spring Boot 实战的 RESTFul 接口文档说明")
                .contact(new Contact("xhy", "https://mp.csdn.net/mp_blog/manage/article", "liushuijinger@163.com"))
                .version("1.0")
                .build();
    }
}