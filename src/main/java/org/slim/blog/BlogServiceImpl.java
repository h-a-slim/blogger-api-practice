package org.slim.blog;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    private BlogRepository repository;

    public BlogServiceImpl(BlogRepository repo) {
        this.repository = repo;
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return repository.findById(id.toString()).get();
    }
}
