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

    @GetMapping("/hello")
    public String hi(@RequestParam("name") String name) {
        return "Hello World= Hello" + name;
    }

    @GetMapping("/print")
    public String print() {
        return "print Praswish";
    }

    @GetMapping("/display")
    public String display() {
        return "display Praswish";
    }



}

