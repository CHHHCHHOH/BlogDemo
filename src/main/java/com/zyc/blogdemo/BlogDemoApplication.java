package com.zyc.blogdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyc.blogdemo.mapper")
public class BlogDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogDemoApplication.class, args);
	}

}
