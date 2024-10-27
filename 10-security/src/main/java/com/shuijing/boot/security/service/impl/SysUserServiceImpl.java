package com.shuijing.boot.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuijing.boot.security.common.ApiException;
import com.shuijing.boot.security.entity.SysUser;
import com.shuijing.boot.security.mapper.SysUserMapper;
import com.shuijing.boot.security.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @since 2021-08-15
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public String getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // 非匿名用户访问才能获得用户信息
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String userName = authentication.getName();
            log.info("userName by SecurityContextHolder: {}", userName);
            return userName;
        }
        throw new ApiException("用户不存在！");
    }
}
