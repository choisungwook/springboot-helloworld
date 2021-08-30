package com.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("/hello")
    public String helloworld() {
        return "hello world";
    }
}
