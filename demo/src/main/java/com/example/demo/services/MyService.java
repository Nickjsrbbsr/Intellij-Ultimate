package com.example.demo.services;

import com.example.demo.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface MyService {

     public String getCachedData(String key);
     public String checkEven(int number);

      }
