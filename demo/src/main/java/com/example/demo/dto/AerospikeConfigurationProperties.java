package com.example.demo.dto;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

//@Component
public class AerospikeConfigurationProperties {

     private  String hostname ="default hostname";
     private int portNo =0 ;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPortNo() {
        return portNo;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }
}
