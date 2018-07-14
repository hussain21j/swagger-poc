package com.spring.swaggerpoc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myswagger/api/healthcheck")
public class HealthController {

    @GetMapping
    public String getHealth() {
        return "Running Well";
    }

    @PostMapping("/add")
    public String processName(@RequestBody final String userName){
        return "Hello "+userName;
    }


}
