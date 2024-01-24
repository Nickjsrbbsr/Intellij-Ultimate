package org.nihar.mandal;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

import static org.nihar.mandal.IPv4Validator.isValidIPv4;

public class InetAddressValidator implements ConstraintValidator<ValidIP, String> {

    private static final Pattern IPV4_PATTERN =
//            Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.");
            Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");


    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
//        if (!(CommonUtility.isNullOrEmpty(value) || IPV4_PATTERN.matcher(value).matches()))
//        {
//            return false;
//        }

//        return true;
    }

    public void initialize(ValidIP parameters) {

    }
//    public static void main(String[] args) {
//        // Test cases
//        System.out.println(isValidIPv4("192.168.0.1"));  // Should return true
//        System.out.println(isValidIPv4("256.0.0.1"));    // Should return false
//        System.out.println(isValidIPv4("10.20.30.40"));   // Should return true
//    }

}