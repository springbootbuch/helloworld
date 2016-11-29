package de.springbootbuch.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    @RestController
    @RequestMapping("/hello")
    public static class HelloWorldController {
        @GetMapping
        public String helloWorld(@RequestParam final String name) {
            return "Hello, " + name + "\n";
        }
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}