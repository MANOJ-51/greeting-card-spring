package com.bridgelabz.greetingcardspring.model;

import javax.persistence.*;

@Entity
@Table(name = "greeting_messages")
public class GreetingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;

    public GreetingModel(String message) {
        this.message = message;
    }

    public GreetingModel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
