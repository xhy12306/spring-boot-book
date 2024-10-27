package com.shuijing.boot.ioc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-06-14
 */
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Driveable driveable;

    public void hangOut() {
        driveable.drive();
    }
}
