package com.zyc.blogdemo.service.impl;

import com.zyc.blogdemo.mapper.CommentMapper;
import com.zyc.blogdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
}
