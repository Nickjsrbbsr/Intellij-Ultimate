package com.org;
// MainApplication.java



import com.org.service.NumberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(NumberService numberService) {
        return args -> {
            try {
                // This should throw a ConstraintViolationException during context initialization
                System.out.println(numberService.processNumber(10));
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            try {
                // This should also throw a ConstraintViolationException
                System.out.println(numberService.processNumber(7));
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        };
    }
}
