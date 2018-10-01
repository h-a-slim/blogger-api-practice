package org.slim.blog;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    private BlogRepository repository;

    public BlogServiceImpl(BlogRepository repo) {
        this.repository = repo;
    }

    @Override
    public void updateBlog(Blog blog) {
        repository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return repository.findAll();
    }

    @Override
    public Blog getBlogById(Long id) {
        return repository.findById(id.toString()).orElse(null);
    }


}
