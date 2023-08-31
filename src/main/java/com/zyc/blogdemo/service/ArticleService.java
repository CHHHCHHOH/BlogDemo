package com.zyc.blogdemo.service;

import com.zyc.blogdemo.pojo.Article;

import java.util.List;

public interface ArticleService {
    void add(Article article);

    List<Article> selectAll();

    Article selectByArticleId(Integer articleId);
}
