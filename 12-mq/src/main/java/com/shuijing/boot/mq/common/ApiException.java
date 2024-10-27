package com.shuijing.boot.mq.common;

import lombok.Data;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-05-30
 */
@Data
public class ApiException extends RuntimeException {

    private Integer code;

    public ApiException(MessageEnum messageEnum) {
        super(messageEnum.getMessage());
        this.code = messageEnum.getCode();
    }

    public ApiException(String message) {
        super(message);
        this.code = 500;
    }

}
