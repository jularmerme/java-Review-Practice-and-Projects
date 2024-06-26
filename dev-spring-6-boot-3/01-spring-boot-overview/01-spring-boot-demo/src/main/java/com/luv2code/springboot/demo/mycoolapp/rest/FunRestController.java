package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World </h1>";
    }
}
