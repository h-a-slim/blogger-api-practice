package org.slim.blog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class BlogServiceTest {

    @MockBean
    private BlogRepository blogRepository;

    private BlogService blogService;

    @Before
    public void setUp() throws Exception {
        blogService = new BlogServiceImpl(blogRepository);
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