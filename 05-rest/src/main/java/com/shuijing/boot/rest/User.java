package com.shuijing.boot.rest;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2020/11/29
 */
@Data
@ApiModel("用户信息")
@AllArgsConstructor
public class User {

    @ApiModelProperty("用户ID")
    private int id;

    @ApiModelProperty("名字")
    @NotBlank(message = "名字不能为空")
    private String name;

    @ApiModelProperty("年龄")
    @Min( value = 1,message = "年龄要不能小于 1")
    @Max( value = 120,message = "年龄要不能大于 120")
    private int age;

    @ApiModelProperty("邮箱")
    @Email(message = "Email格式不正确")
    private String email;

    @ApiModelProperty("生日")
    @Past(message = "生日必须为过去的时间")
    private LocalDate birthDay;
}