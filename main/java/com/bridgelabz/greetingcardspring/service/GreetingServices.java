package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.dto.GreetingDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServices implements IGreetingService {
    private AtomicLong count = new AtomicLong();

    @Override
    public GreetingDTO greetingMessage() {
        return new GreetingDTO(count.incrementAndGet(), "Hello Manoj");
    }
}
