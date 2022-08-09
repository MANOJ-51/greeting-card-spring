package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.model.GreetingModel;

import java.util.List;


public interface IGreetingService {
    GreetingModel greetingMessage();

    GreetingModel greetingMessage(String name);

    GreetingModel greetingMessage(String firstName, String lastName);

    GreetingModel getGreetingById(Long id);

    List<GreetingModel> getGreetingList();

    GreetingModel editGreeting(GreetingModel greetingModel);

    GreetingModel deleteGreetingById(Long id);
}
