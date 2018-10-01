package org.slim.api;


import org.slim.blog.Blog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(path = "/blog")
public class BlogApi {

    @RequestMapping(method = RequestMethod.POST)
    public void addBlog(Blog blog)
    {

    }

    @RequestMapping(method = RequestMethod.GET)
    public void getAllBlogs(Blog blog)
    {

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getBlogById(String id)
    {
        return "Hello there";
    }
}
