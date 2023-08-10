package com.ldf.shardingjdbcdemo.controller;

import com.ldf.shardingjdbcdemo.entity.User;
import com.ldf.shardingjdbcdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("selectAll")
    public void selectAll(){

        List<User> users = userMapper.selectList(null);

    }
}
