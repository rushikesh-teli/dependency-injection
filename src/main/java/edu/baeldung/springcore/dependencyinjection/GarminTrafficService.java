package edu.baeldung.springcore.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class GarminTrafficService implements TrafficService {

    @Override
    public String getLiveTraffic() {
        return "Garmin";
    }
}
