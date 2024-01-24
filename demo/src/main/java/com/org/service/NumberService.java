package com.org.service;

// NumberService.java
//package com.example.service;

import com.org.validation.EvenOddValidation;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class NumberService {

    public String processNumber(@EvenOddValidation @Valid int number) {
        return "Even Number";
    }
}
