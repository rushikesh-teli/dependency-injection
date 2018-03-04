package edu.baeldung.springcore.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class GoogleNavigationService implements NavigationService {

    @Override
    public String getRoute() {
        return "Google";
    }
}
