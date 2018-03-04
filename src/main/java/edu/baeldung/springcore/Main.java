package edu.baeldung.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Main entry point for the application.
 */
public class Main {

    /**
     * Private 0 argument constructor to keep Checkstyle happy.
     */
    private Main() {

    }

    /**
     * Entry point to our application. Launches Spring.
     * @param args program arguments.
     * @see DependsRunner
     */
    public static void main(String... args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class, args)) {
            System.exit(SpringApplication.exit(context));
        }
    }
}