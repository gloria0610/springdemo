package com.learn.springdemo.service.impl;

import com.learn.springdemo.dao.IUserDAO;
import com.learn.springdemo.model.User;
import com.learn.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDao;

    public List<User> selectUsers() {
        return userDao.selectUsers();
    }
}