package com.shuijing.boot.security.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuijing.boot.security.entity.User;
import com.shuijing.boot.security.mapper.UserMapper;
import com.shuijing.boot.security.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @since 2021-05-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
