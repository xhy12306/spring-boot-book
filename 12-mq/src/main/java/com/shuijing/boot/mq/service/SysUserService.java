package com.shuijing.boot.mq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuijing.boot.mq.entity.SysUser;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @since 2021-08-15
 */
public interface SysUserService extends IService<SysUser> {

    String getCurrentUser();
}
