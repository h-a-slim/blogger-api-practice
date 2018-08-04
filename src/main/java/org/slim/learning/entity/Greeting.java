package org.slim.learning.entity;


import org.springframework.data.annotation.Id;

public class Greeting {

    @Id
    private String id;

    private String to;
    private String message;

    public Greeting(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
