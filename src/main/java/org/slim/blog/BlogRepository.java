package org.slim.blog;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<Blog, String> {}