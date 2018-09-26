package org.slim.learning.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.slim.blog.BlogRepository;
import org.slim.blog.BlogService;
import org.slim.blog.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GreeterTest {

    @Autowired
    public BlogService blogService;

    @Before
    public void setUp() throws Exception {
        blogService.findAll();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void greet() {
    }
}