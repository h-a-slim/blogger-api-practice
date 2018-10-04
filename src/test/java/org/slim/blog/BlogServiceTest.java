package org.slim.blog;

import org.hibernate.validator.constraints.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class BlogServiceTest {
    @Configuration
    public static class Config {
        @MockBean
        private BlogRepository blogRepository;

        @Bean
        public BlogService blogService()
        {
            BlogServiceImpl blogServiceMongo = new BlogServiceImpl(blogRepository);
            return blogServiceMongo;
        }
    }

    @Autowired
    private BlogService blogService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateBlog() {
        blogService.getAllBlogs();
    }

    @Test
    public void getAllBlogs() {
    }

    @Test
    public void getBlogById() {
    }
}