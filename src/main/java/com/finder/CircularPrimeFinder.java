package com.finder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularPrimeFinder {

    public static boolean isPrime(Integer number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static Integer shiftRight(Integer number) {
        String string = number.toString();
        char[] chars = string.toCharArray();
        char first = chars[0];
        for (int i = 0; i < chars.length-1; i++) {
            chars[i] = chars[i+1];
        }
        chars[chars.length-1] = first;
        return Integer.parseInt(new String(chars));
    }



}
