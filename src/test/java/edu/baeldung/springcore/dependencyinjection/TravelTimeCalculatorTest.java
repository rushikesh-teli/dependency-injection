package edu.baeldung.springcore.dependencyinjection;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TravelTimeCalculatorTest {
	
	@Autowired
	TravelTimeCalculator travelTimeCalculator;

	@Test
    public void testCalculateTravelTime() {
        Assertions.assertThat(travelTimeCalculator.calculateTravelTime()).isEqualTo("GoogleGarmin");
    }
}
