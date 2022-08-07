package com.bridgelabz.greetingcardspring.controller;

import com.bridgelabz.greetingcardspring.dto.GreetingDTO;
import com.bridgelabz.greetingcardspring.service.GreetingServices;
import com.bridgelabz.greetingcardspring.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/welcome")
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;

    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public GreetingDTO greetCard() {
        return iGreetingService.greetingMessage();
    }
}
