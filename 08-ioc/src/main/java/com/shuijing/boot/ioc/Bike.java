package com.shuijing.boot.ioc;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-06-14
 */
@Slf4j
public class Bike implements Driveable{
    @Override
    public void drive() {
        log.info("骑着自行车出去浪~");
    }
}
