package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
