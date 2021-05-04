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

    /**
     * Shift dit getal eentje naar rechts
     * @param number bv 317
     * @return 731
     */
    public static Integer shiftRight(Integer number) {
        String string = number.toString();
        char[] chars = string.toCharArray();
        char first = chars[0];
        for (int i = 0; i < chars.length-1; i++) {
            // hier
            chars[i] = chars[i+1];
        }
        chars[chars.length-1] = first;
        return Integer.parseInt(new String(chars));
    }

    public static List<Integer> giveRotations(Integer number) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(number);
        for (int i = 0; i < number.toString().length()-1; i++) {
            number = shiftRight(number);
            list.add(number);
        }
        Collections.sort(list);
        return list;
    }

}
