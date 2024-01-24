package com.example.demo.services.impl;

import com.example.demo.myanno.EvenOddValidation;
import com.example.demo.repository.MyRepository;
import com.example.demo.services.MyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Autowired
    MyRepository myrepo;

    @Override
    public String checkEven(@EvenOddValidation @Valid int no){
        return "Even number : "+no;
    }


    @Cacheable("myCache")
    public String getCachedData(String key){
          timeTakingOperation();

        return "data "+key;
    }

    public void timeTakingOperation(){

          try{


              Thread.sleep(2000);
          }
          catch (InterruptedException e){
              e.printStackTrace();
          }
          catch (Exception e){
              e.printStackTrace();
          }

    }




}
