package com.org.hello.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Data
@RestController
public class MyContoller {
    @GetMapping("/get")
    public String helloWorld(){
        return "hello world";
    }
}
