package com.sample.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Launcher.
 *
 * @author Aaric, created on 2020-09-04T09:33.
 * @version 0.1.0-SNAPSHOT
 */
@SpringBootApplication
public class App {

    /**
     * Main
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

//        EndpointImpl.publish("/hello", new HelloWebServiceImpl());
    }
}
