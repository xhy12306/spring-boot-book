package com.shuijing.boot.es.common;

import lombok.Getter;

/**
 * 消息枚举类
 *
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-5-30
 */
@Getter
public enum MessageEnum {
    ERROR(500, "系统错误"),
    SUCCESS(0, "操作成功！"),
    ;
    private final Integer code;
    private final String message;

    MessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}