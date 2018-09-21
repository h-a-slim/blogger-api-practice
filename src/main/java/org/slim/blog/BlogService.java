package org.slim.blog;

import java.util.List;

public interface BlogService {
    void save(Blog blog);
    List<Blog> findAll();
    Blog findById(Long id);
}
