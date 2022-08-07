package com.bridgelabz.greetingcardspring.controller;

import com.bridgelabz.greetingcardspring.dto.GreetingDTO;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/welcome")
public class GreetingController {
    private static final String TEMPLATE = "Hello,%s";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public GreetingDTO greetCard(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new GreetingDTO(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
