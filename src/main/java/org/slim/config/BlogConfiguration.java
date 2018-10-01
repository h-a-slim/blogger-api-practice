package org.slim.config;

import org.slim.blog.BlogRepository;
import org.slim.blog.BlogService;
import org.slim.blog.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class BlogConfiguration {

    @Autowired
    private BlogRepository blogRepository;

    @Bean
    public BlogService blogService()
    {
        BlogServiceImpl blogServiceMongo = new BlogServiceImpl(blogRepository);
        return blogServiceMongo;
    }
}
