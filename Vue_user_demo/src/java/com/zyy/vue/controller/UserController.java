package com.zyy.vue.controller;

import com.zyy.vue.domain.User;
import com.zyy.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findOne/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    //传统方式
    @RequestMapping("/findOne")
    public User findOne(Integer id) {
        return userService.findById(id);
    }
}
