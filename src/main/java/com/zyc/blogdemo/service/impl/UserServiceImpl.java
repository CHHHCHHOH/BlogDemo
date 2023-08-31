package com.zyc.blogdemo.service.impl;

import com.zyc.blogdemo.mapper.UserMapper;
import com.zyc.blogdemo.pojo.User;
import com.zyc.blogdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
