package com.bridgelabz.greetingcardspring.controller;

import com.bridgelabz.greetingcardspring.dto.UserDTO;
import com.bridgelabz.greetingcardspring.model.GreetingModel;
import com.bridgelabz.greetingcardspring.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/welcome")
public class GreetingController {
    public static final String TEMPLATE_1 = "Hello %s";
    public static final String TEMPLATE_2 = "Hello %s %s";
    public static final AtomicLong COUNTER = new AtomicLong();
    @Autowired
    IGreetingService iGreetingService;

    @RequestMapping(value = {"", "/", "/greetParam"}, method = RequestMethod.GET)
    public GreetingModel greetCardParam(@RequestParam(value = "name", defaultValue = "world") String name) {
        return iGreetingService.greetingMessage(name);
    }

    @RequestMapping(value = {"", "/", "/greetCard"}, method = RequestMethod.GET)
    public GreetingModel greetCard() {
        return iGreetingService.greetingMessage();
    }

    @PostMapping("/post")
    public GreetingModel sayHello(@RequestBody UserDTO userDTO) {
        if (userDTO.getFirstName() == null && userDTO.getLastName() == null) {
            return iGreetingService.greetingMessage();
        } else if (userDTO.getFirstName() == null) {
            return iGreetingService.greetingMessage(userDTO.getLastName());
        } else if (userDTO.getLastName() == null) {
            return iGreetingService.greetingMessage(userDTO.getFirstName());
        } else {
            return iGreetingService.greetingMessage(userDTO.getFirstName(), userDTO.getLastName());
        }
    }
}
