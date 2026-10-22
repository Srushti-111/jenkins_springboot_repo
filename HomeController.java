
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Application!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is the About page of our application.";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact: support@example.com";
    }
}
