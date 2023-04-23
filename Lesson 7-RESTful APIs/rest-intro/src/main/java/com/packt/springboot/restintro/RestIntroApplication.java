package com.packt.springboot.restintro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Demo application for RESTful APIs –
 * Lesson 7 of Spring Boot 2 Fundamentals by Packt Publishing.
 *
 * @author Michael Piefel
 */
@Slf4j
@SpringBootApplication
public class RestIntroApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestIntroApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("RestIntroApplication.run...");
    }
}
