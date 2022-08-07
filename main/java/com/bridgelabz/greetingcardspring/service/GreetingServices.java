package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.controller.GreetingController;
import com.bridgelabz.greetingcardspring.model.GreetingModel;
import org.springframework.stereotype.Service;

import static com.bridgelabz.greetingcardspring.controller.GreetingController.TEMPLATE_1;
import static com.bridgelabz.greetingcardspring.controller.GreetingController.TEMPLATE_2;

@Service
public class GreetingServices implements IGreetingService {

    @Override
    public GreetingModel greetingMessage() {
        return new GreetingModel(GreetingController.COUNTER.incrementAndGet(),
                "Hello Manoj");
    }

    @Override
    public GreetingModel greetingMessage(String name) {
        return new GreetingModel(GreetingController.COUNTER.incrementAndGet(),
                String.format(TEMPLATE_1, name));
    }

    @Override
    public GreetingModel greetingMessage(String firstName, String lastName) {
        return new GreetingModel(GreetingController.COUNTER.incrementAndGet(),
                String.format(TEMPLATE_2, firstName, lastName));
    }
}
