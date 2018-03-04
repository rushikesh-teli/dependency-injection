package edu.baeldung.springcore.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Example of setter injection.
 */
@Component
public class RouteCalculator {

    private NavigationService navigationService;

    @Autowired
    public void setNavigationService(NavigationService navigationService) {
        this.navigationService = navigationService;
    }

    public String calculateRoute() {
        return navigationService.getRoute();
    }
}
