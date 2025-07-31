package com.yourorg.library.Controller;

import com.yourorg.library.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    //field Injection
    @Autowired
    @Qualifier("Morning Service")
    private GreetingService FieldGreetingService;

    private GreetingService ConstructorGreetingService;

    private GreetingService SetterGreetingService;

    //Constructor Injection
    public GreetingController(@Qualifier("Evening Service")GreetingService greetingService)
    {
        this.ConstructorGreetingService=greetingService;
    }

    //setter Injection
    @Autowired
    @Qualifier("Evening Service")
    public void Setgreeting(GreetingService greetingService)
    {
     this.SetterGreetingService = greetingService;
    }


    @GetMapping("/construct")
    public String constructorGreeting()
    {
        return ConstructorGreetingService.getGreeting();
    }
    @GetMapping("/setter")
    public String setterGreeting()
    {
        return SetterGreetingService.getGreeting();
    }
    @GetMapping("/field")
    public String fieldGreeting()
    {
        return FieldGreetingService.getGreeting();
    }

}
