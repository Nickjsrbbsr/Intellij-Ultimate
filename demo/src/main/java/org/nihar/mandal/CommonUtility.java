package org.nihar.mandal;

public class CommonUtility {
    public  static boolean isNullOrEmpty(String value){
        if(value.isEmpty())
            return true;
        else if (value.isBlank()) {
            return true;

        }
        return false;
    }
}
