package org.slim.blog;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class BlogServiceMongoImpl implements BlogService {

    private MongoRepository<Blog, String> repository;

    public BlogServiceMongoImpl(MongoRepository<Blog, String> repo) {
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
