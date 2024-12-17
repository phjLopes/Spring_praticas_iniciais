package com.example.first_spring_app.controller;

import com.example.first_spring_app.domain.*;
import com.example.first_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWordService helloWordService;


    @GetMapping
    public String HelloWorld() {
        return helloWordService.helloWorld("Pedro");
    }

@PostMapping("/{id}")
    public String HelloWorld(@PathVariable("id") String id,@RequestParam(value = "filter")String fi  ,@RequestBody User body) {
        return "Hello World"+ body.getName()+ id;
}

}
