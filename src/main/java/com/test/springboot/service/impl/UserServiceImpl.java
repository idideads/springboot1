package com.test.springboot.service.impl;

import com.test.springboot.entity.User;
import com.test.springboot.mapper.UserMapper;
import com.test.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public String checkTime() {
        return userMapper.checkTime();
    }
}
