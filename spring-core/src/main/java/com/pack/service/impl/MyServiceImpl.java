package com.pack.service.impl;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import com.pack.myanno.EvenOddValidation;
import com.pack.service.MyService;
@Service
public class MyServiceImpl implements MyService {
    @Override
    public String checkEvenNumber(@EvenOddValidation @Valid int number){
        return "even number ";
    }


    public String checkEvenNumber(Integer number) {
        return null;
    }
}
