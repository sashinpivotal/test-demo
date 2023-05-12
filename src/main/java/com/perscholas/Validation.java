package com.perscholas;

import java.util.Arrays;
import java.util.List;

public class Validation {

    public static Boolean isValid(String userName) {
        String[] invalidCharArray = "!@#$%^&*()".split("");
        List<String> invalidChars = Arrays.asList(invalidCharArray);
        String[] userNameCharacterArray = userName.split("");
        for (String currentCharacter : userNameCharacterArray) {
            if (invalidChars.contains(currentCharacter)) {
                System.out.println("Invalid username!");
                return false;
            }
        }
        return true;
    }
}
