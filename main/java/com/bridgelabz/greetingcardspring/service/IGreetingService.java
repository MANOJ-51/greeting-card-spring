package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.dto.GreetingDTO;
import org.springframework.web.bind.annotation.RequestParam;

public interface IGreetingService {
    GreetingDTO greetingMessage();
}
