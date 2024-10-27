package com.shuijing.boot.es.manager.mq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-10-24
 */
@SpringBootTest
class MQSenderTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void send() {
        rabbitTemplate.convertAndSend("boot-exchange", "boot.mq", "hello");
    }
}