package org.nihar.mandal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;

import static org.nihar.mandal.IPv4Validator.isValidIPv4;

public class MyClass {

    @ValidIP(message = "Enter a valid IP address")
    private String ip ;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public static String checkIp(@NotEmpty @NotNull @NonNull @org.springframework.lang.NonNull @NotBlank String ip){
           return "true";
    }

    public static void main(String[] args) {
        System.out.println(checkIp(""));  // Should return true
        System.out.println(checkIp("256.0.0.1"));    // Should return false
        System.out.println(checkIp("10.20.30.40"));   // Should return true
    }
}
