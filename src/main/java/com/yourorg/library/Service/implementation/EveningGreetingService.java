package com.yourorg.library.Service.implementation;

import com.yourorg.library.Service.GreetingService;
import org.springframework.stereotype.Service;

@Service("Evening Service")
public class EveningGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Good Evening!";
    }
}
