package com.learn.springdemo.service;

import com.learn.springdemo.model.User;

import java.util.List;

public interface IUserService {

    List<User> selectUsers();
}
