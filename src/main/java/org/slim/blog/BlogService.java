package org.slim.blog;

import java.util.List;

public interface BlogService {
    void save(Blog blog);
    List<Blog> getAllBlogs();
    Blog getBlogById(Long id);
}
