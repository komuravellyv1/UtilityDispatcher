package com.venky.spring.dev.UtilityDispatcher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping(path = "/api/hello")
    public String getHelloWorld(){
        return "Hello World";
    }
}
