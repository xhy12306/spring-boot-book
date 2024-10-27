package com.shuijing.boot.mq.manager.quartz;

import com.shuijing.boot.mq.entity.User;
import com.shuijing.boot.mq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2021-10-07
 */
@Slf4j
@Component
public class MyJob extends QuartzJobBean {

    @Autowired
    private UserService userService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        List<User> userList = userService.list();
        log.info("my job");
        userList.forEach(user -> log.info(user.toString()));
    }
}
