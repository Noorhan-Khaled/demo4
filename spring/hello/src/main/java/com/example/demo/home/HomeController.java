package com.example.demo.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value="/")
    public String greeting(){
        return "Hello World";
    }
}
