package org.slim.learning.config;

import org.slim.blog.Blog;
import org.slim.blog.BlogService;
import org.slim.blog.BlogServiceMongoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

interface BlogRepository extends MongoRepository<Blog, String> {}

@Configuration
public class BlogConfiguration {

    @Autowired
    private  BlogRepository blogRepository;

    @Bean
    public BlogService blogService()
    {
        BlogServiceMongoImpl blogServiceMongo = new BlogServiceMongoImpl(blogRepository);
        return blogServiceMongo;
    }
}
