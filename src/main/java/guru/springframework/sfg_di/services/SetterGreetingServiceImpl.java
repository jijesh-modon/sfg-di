package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey there! You reached the Setter Greeting Service";
    }
}
