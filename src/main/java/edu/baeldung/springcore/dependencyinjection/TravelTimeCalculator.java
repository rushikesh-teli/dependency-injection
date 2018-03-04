package edu.baeldung.springcore.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Example of constructor injection.
 */
@Component
public class TravelTimeCalculator {

    private NavigationService navigationService;

    private TrafficService trafficService;

    @Autowired
    public TravelTimeCalculator (NavigationService navigationService, TrafficService trafficService) {
        this.navigationService = navigationService;
        this.trafficService = trafficService;
    }

    public String calculateTravelTime() {
        return navigationService.getRoute() + trafficService.getLiveTraffic();
    }
}
