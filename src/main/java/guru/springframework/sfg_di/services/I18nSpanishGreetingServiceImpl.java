package guru.springframework.sfg_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Ola Amigo!";
    }
}
