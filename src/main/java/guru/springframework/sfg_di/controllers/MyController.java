package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public String sayHello() {
        System.out.println("Hey There!");

        return "What's up!";
    }
}
