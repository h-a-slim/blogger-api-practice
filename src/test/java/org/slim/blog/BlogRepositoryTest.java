package org.slim.blog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class BlogRepositoryTest {

    @Autowired
    private BlogRepository blogRepository;
    private List<Blog> blogList;


    @Before
    public void setUp() throws Exception {
        Blog[] blogs = new Blog[] {
                new Blog("hasan", "some text"),
                new Blog("hslim", "some more text")
        };

        this.blogList = Arrays.asList(blogs);
    }

    @Test
    public void testRepository() {
        blogRepository.deleteAll();
        this.blogList.forEach(blog -> blogRepository.save(blog));
    }

    @After
    public void tearDown() throws Exception {
    }
}