package org.slim.learning.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.slim.learning.entity.Greeting;

import java.util.List;

public interface GreetingRepository extends  MongoRepository<Greeting, String> {
    List<Greeting> findAllByTo(String to);
}
