package com.example.demo.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
//@EnableConfigurationProperties(AerospikeConfig.AerospikeConfigurationProperties.class)
public class AerospikeConfig {


  @Component
  @Primary
  @Qualifier("A")
  @ConfigurationProperties(prefix = "aerospike")
    public static class AerospikeConfigurationProperties{
      private  String hostname ;
//      public void setHostname(){
//          this.hostname = hostname;
//      }


      public void setHostname(String hostname) {
          this.hostname = hostname;
      }

      public String getHostname() {
          return this.hostname;
      }
  }
}
