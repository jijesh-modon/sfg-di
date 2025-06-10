package guru.springframework.sfg_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey there! You reached the PRIMARY Greeting Service";
    }
}
