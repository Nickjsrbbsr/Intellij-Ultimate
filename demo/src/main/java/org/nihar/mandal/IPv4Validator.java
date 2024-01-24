package org.nihar.mandal;

import java.util.regex.Pattern;

public class IPv4Validator {

    private static final Pattern IPV4_PATTERN =
            Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");

    public static boolean isValidIPv4(String ipAddress) {
        return IPV4_PATTERN.matcher(ipAddress).matches();
    }

//    public static void main(String[] args) {
//        // Test cases
//        System.out.println(isValidIPv4("192.168.0.1"));  // Should return true
//        System.out.println(isValidIPv4("256.0.0.1"));    // Should return false
//        System.out.println(isValidIPv4("10.20.30.40"));   // Should return true
//    }
}

