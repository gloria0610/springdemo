package com.learn.springdemo.dao;

import com.learn.springdemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDAO {
    List<User> selectUsers();
}
