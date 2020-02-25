package com.test.springboot.service;

import com.test.springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    String checkTime();
}
