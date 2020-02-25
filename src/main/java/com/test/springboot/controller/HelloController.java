package com.test.springboot.controller;

import com.test.springboot.entity.User;
import com.test.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("HelloController.hello");
        return "Hello SrpingBoot";
    }

    @RequestMapping("/user")
    public User userTest() {
        User user = new User();
        user.setId(1L);
        user.setUsername("小明");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping("/findAll")
    public List<User> findAll() {
        System.out.println("HelloController.findAll");
        return userService.findAll();
    }

    @RequestMapping("/time")
    public String checkTime() {
        System.out.println("HelloController.checkTime");
        return userService.checkTime();
    }
}
