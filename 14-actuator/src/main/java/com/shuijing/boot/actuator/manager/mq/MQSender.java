package com.shuijing.boot.actuator.manager.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-10-24
 */
@Component
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void send() {
        rabbitTemplate.convertAndSend("boot-exchange", "boot.mq", "hello");
    }
}
