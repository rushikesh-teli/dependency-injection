package edu.baeldung.springcore.dependencyinjection;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class RouteCalculatorTest {

    @Autowired
    private RouteCalculator routeCalculator;

    @Test
    public void testCalculateRoute() {
        Assertions.assertThat(routeCalculator.calculateRoute()).isEqualTo("Google");
    }
}
