package com.zyc.blogdemo.mapper;

import com.zyc.blogdemo.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    void add(Article article);

    List<Article> selectAll();

    Article selectByArticleId(Integer articleId);

}
