package com.example.pwlloginsederhana;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "you don't need to be logged in 1";
    }

    @GetMapping("/not-restricted")
    public String notRestricted() {
        return "you don't need to be logged in 2";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "if you see this you are logged in";
    }
}