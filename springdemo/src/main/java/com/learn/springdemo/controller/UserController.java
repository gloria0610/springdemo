package com.learn.springdemo.controller;


import com.learn.springdemo.model.User;
import com.learn.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/user")
    public List<User> getUsers(){
        return userService.selectUsers();
    }

}
