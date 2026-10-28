
package com.purvish.simple_web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Jay mahakaal";
    }

    @GetMapping("/about")
    public String getabout() {
        return "This is a simple web application built using Spring Boot.";
    }
}
