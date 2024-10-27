package com.shuijing.boot.es.controller;

import com.shuijing.boot.es.common.Result;
import com.shuijing.boot.es.entity.User;
import com.shuijing.boot.es.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息 前端控制器
 * </p>
 *
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @since 2021-05-30
 */
@RestController
@RequestMapping("/user")
@Api(value = "User对象",tags = "用户信息")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "查询")
    @GetMapping(value = "/{id}")
    public Result<User> get(@PathVariable Integer id) {
      return Result.success(userService.getById(id));
    }

    @ApiOperation(value = "新增")
    @PostMapping
    public Result<Boolean> add(@RequestBody User user) {
      return Result.success(userService.save(user));
    }

    @ApiOperation(value = "修改")
    @PutMapping
    public Result<Boolean> modify(@RequestBody User user) {
      return Result.success(userService.updateById(user));
    }

    @ApiOperation(value = "删除")
    @DeleteMapping(value = "/{id}")
    public Result<Boolean> remove(@PathVariable Integer id) {
      return Result.success(userService.removeById(id));
    }
}
