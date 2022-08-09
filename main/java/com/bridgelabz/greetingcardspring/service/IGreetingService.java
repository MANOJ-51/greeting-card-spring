package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.model.GreetingModel;


public interface IGreetingService {
    GreetingModel greetingMessage();

    GreetingModel greetingMessage(String name);

    GreetingModel greetingMessage(String firstName, String lastName);

    GreetingModel getGreetingById(Long id);
}
