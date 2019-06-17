package com.zyy.vue.service;

import com.zyy.vue.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    void update(User user);
}
