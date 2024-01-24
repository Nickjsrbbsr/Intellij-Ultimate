package com.example.demo;

import com.example.demo.services.MyService;
import com.example.demo.services.impl.MyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        log.info("Hello World from Logger ..!!!!");
    }

    // This is just an example bean to demonstrate the validation in action
    @Bean
    public CommandLineRunner commandLineRunner(MyServiceImpl numberService) {
        return args -> {
            // Valid even number
            System.out.println(numberService.checkEven(10));  // Should print "Even Number"

            // Invalid odd number
            // This will throw a ConstraintViolationException or can be handled accordingly
            System.out.println(numberService.checkEven(7));
        };

    }
}
