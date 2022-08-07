package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.controller.GreetingController;
import com.bridgelabz.greetingcardspring.model.GreetingModel;
import com.bridgelabz.greetingcardspring.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.bridgelabz.greetingcardspring.controller.GreetingController.TEMPLATE_1;
import static com.bridgelabz.greetingcardspring.controller.GreetingController.TEMPLATE_2;

@Service
public class GreetingServices implements IGreetingService {

    @Autowired
    IGreetingRepository iGreetingRepository;

    @Override
    public GreetingModel greetingMessage() {
        return iGreetingRepository.save(new GreetingModel("Hello Manoj"));
    }

    @Override
    public GreetingModel greetingMessage(String name) {
        return iGreetingRepository.save(new GreetingModel(String.format(GreetingController.TEMPLATE_1, name)));
    }

    @Override
    public GreetingModel greetingMessage(String firstName, String lastName) {
        return iGreetingRepository.save(new GreetingModel(String.format(GreetingController.TEMPLATE_2, firstName, lastName)));
    }
}
