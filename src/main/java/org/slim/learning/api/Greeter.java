package org.slim.learning.api;

import org.slim.learning.api.response.GreetingResponse;
import org.slim.learning.entity.Greeting;
import org.slim.learning.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Greeter {
    @Autowired
    private GreetingRepository greetingRepository;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public GreetingResponse greet() {
        greetingRepository.deleteAll();
        greetingRepository.insert(new Greeting("hasan slim", "hello m3allim"));
        List<Greeting> greetingsList = greetingRepository.findAll();

        GreetingResponse response = new GreetingResponse();
        response.setMessage(greetingsList.get(0).getTo());
        return response;
    }
}
