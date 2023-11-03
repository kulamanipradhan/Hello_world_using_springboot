package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello()
    {
            return "Hello ,Kulamani !";
    }
    @GetMapping("/about")
    public  String about()
    {
        return "We are Group of Talented People who can solve your Problem efficently ";
    }

}
