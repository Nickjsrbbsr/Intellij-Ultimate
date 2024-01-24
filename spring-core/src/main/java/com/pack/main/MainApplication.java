package com.pack.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pack.config.AppConfig;
import com.pack.service.impl.MyServiceImpl;

public class MainApplication {

     MyServiceImpl myService = new MyServiceImpl();
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        MyServiceImpl myService =annotationConfigApplicationContext.getBean(MyServiceImpl.class);
        MyServiceImpl myService = new MyServiceImpl();
        myService.checkEvenNumber(10);
        myService.checkEvenNumber(11);
    }
}
