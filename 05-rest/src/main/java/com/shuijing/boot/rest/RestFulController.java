package com.shuijing.boot.rest;

import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author xhy
 * @blog https://mp.csdn.net/mp_blog/manage/article
 * @date 2020/12/19
 */
@RestController
@Api(tags = "RESTful 接口")
@RequestMapping("/rest")
public class RestFulController {

    HashMap<Integer, User> map = Maps.newHashMap();

    {
        map.put(1, new User(1, "admin", 18, "admin@mail.com", LocalDate.now()));
        map.put(2, new User(2, "lyh", 18, "lyh@mail.com", LocalDate.now()));
        map.put(3, new User(3, "xhy", 18, "xhy@mail.com", LocalDate.now()));
    }


    @GetMapping("/swagger")
    @ApiOperation(value = "Swagger 接口")
    public String swagger() {
        return "Swagger Method";
    }

    @GetMapping("/user/{id}")
    @ApiOperation(value = "根据id获取用户信息")
    public User get(@PathVariable @ApiParam("用户ID") int id) {
        // 演示代码，实际开发需要与数据库交互
        return new User(id, "ID为" + id + "的用户", 18, "xhy@mail.com", LocalDate.now());
    }

    @ApiOperation(value = "创建用户")
    @PostMapping("/user")
    public boolean create(@RequestBody User user) {
        // 演示代码，实际开发需要与数据库交互
        return Objects.isNull(user) ? false : true;
    }

    @ApiOperation(value = "更新用户")
    @PutMapping("/user")
    public boolean update(@RequestBody User user) {
        // 演示代码，实际开发需要与数据库交互
        return Objects.isNull(user) ? false : true;
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/user/{id}")
    public boolean delete(@PathVariable int id) {
        // 演示代码，实际开发需要与数据库交互
        return id > 0 ? true : false;
    }

    @ApiOperation("获取用户列表")
    @GetMapping("/list")
    public List<User> userList() {
        return new ArrayList<>(map.values());
    }

}