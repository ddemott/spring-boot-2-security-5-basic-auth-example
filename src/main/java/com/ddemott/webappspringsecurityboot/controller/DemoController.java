package com.ddemott.webappspringsecurityboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController             // to generate JSON Response
public class DemoController {
    @GetMapping(value = "index")
    public String index(){
        return "This is index API and It's without Security";
    }
    @GetMapping(value = "secureAPI")
    public String secureAPI() {
        return "Spring security 5 in-memory Basic Authentication Example";
    }
}
