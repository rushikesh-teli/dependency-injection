package edu.baeldung.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.baeldung.springcore.dependencyinjection.RouteCalculator;
import edu.baeldung.springcore.dependencyinjection.TravelTimeCalculator;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    TravelTimeCalculator travelTimeCalculator;

    @Autowired
    RouteCalculator routeCalculator;

    @Override
    public void run(String... arg0) throws Exception {
        System.out.println(travelTimeCalculator.calculateTravelTime());
        System.out.println(routeCalculator.calculateRoute());
    }
}