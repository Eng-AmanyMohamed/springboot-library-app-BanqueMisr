package com.yourorg.library.Service.implementation;

import com.yourorg.library.Service.GreetingService;
import org.springframework.stereotype.Service;

@Service("Morning Service")
public class MorningGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Good Morning!";
    }
}
