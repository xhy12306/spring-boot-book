package com.shuijing.boot.mvc;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2020/11/29
 */
@Data
public class User {
    @NotBlank(message = "名字不能为空")
    private String name;

    @Min( value = 1,message = "年龄要不能小于 1")
    @Max( value = 120,message = "年龄要不能大于 120")
    private int age;

    @Email(message = "Email格式不正确")
    private String email;

    @Past(message = "生日必须为过去的时间")
    private LocalDate birthDay;
}