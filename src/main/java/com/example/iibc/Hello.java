package com.example.iibc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    
    @GetMapping("/init")
    public String test() {
        return "Hello, World";
    }
}
