package org.slim.blog;

import java.util.List;

public interface BlogService {
    void updateBlog(Blog blog);
    List<Blog> getAllBlogs();
    Blog getBlogById(Long id);
}
