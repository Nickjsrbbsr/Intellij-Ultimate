package com.example.demo.controller;

import com.example.demo.dto.AerospikeConfig;
import com.example.demo.dto.Person;
import com.example.demo.services.MyService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

//@Slf4j
@RestController
@EnableCaching
@RequestMapping("/url")
public class MyDemoController {


     @Autowired
    MyService myService;
//    public static final Logger logger = (Logger) LoggerFactory.getLogger(MyDemoController.class);


    @Autowired
    Person person;

     private final AerospikeConfig.AerospikeConfigurationProperties aerospikeProperties;
     public MyDemoController(@Qualifier("A") AerospikeConfig.AerospikeConfigurationProperties aerospikeProperties){
           this.aerospikeProperties = aerospikeProperties;
     }

      @GetMapping("/get")
    public ResponseEntity<Person> getPerson(){
     return new ResponseEntity<>(person , HttpStatus.OK);
}

    @PostMapping("/post")
    public ResponseEntity<Person> getPerson(@RequestBody Person persons){
        System.out.println("Person details from Client " +persons.getPid() +"  " + persons.getFirstName()+ "    " + persons.getLastName());
//        logger.info("person data fetched successfully ");
        return new ResponseEntity<>(person , HttpStatus.OK);
    }

    @GetMapping("/cache/{key}")
    public ResponseEntity<String> getCachedData(@PathVariable String key){
     String result =  myService.getCachedData(key);
     return new ResponseEntity<>(result,HttpStatus.OK);
        }

        @GetMapping("/getaerospikedetails")
    public ResponseEntity<String> getAerospikeDetails(){
        return new ResponseEntity<>(  this.aerospikeProperties.getHostname(),HttpStatus.OK);
        }

       @GetMapping("/checkEven/{number}")
    public ResponseEntity<String> checkEven(@PathVariable int number){
         return new ResponseEntity<>(myService.checkEven(number),HttpStatus.OK);
       }







}
