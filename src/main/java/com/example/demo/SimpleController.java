package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String testing() {
        return "Praswish";
    }

    @GetMapping("/say")
    public String say() {
        return "say Praswish";
    }

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return "Hello World= HI " + name;
    }



}

