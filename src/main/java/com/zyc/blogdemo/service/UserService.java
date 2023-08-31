package com.zyc.blogdemo.service;

import com.zyc.blogdemo.pojo.User;

public interface UserService {
    void add(User user);

    User selectByUsername(String username);
}
