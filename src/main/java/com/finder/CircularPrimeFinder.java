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
     * Shift dit getal eentje naar links
     * @param number bv 317
     * @return 173
     */
    public static Integer shiftLeft(Integer number) {
        String string = number.toString();
        char[] chars = string.toCharArray();
        char first = chars[0];
        for (int i = 0; i < chars.length-1; i++) {
            chars[i] = chars[i+1];
        }
        chars[chars.length-1] = first;
        return Integer.parseInt(new String(chars));
    }

    /**
     * Shift dit getal eentje naar rechts
     * @param number bv 317
     * @return 731
     */
    public static Integer shiftRight(Integer number) {
        String string = number.toString();
        char[] chars = string.toCharArray();
        char last = chars[chars.length-1];
        for (int i = chars.length-1; i > 0; i--) {
            chars[i] = chars[i-1];
        }
        chars[0] = last;
        return Integer.parseInt(new String(chars));
    }

    public static List<Integer> giveRotations(Integer number) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(number);
        for (int i = 0; i < number.toString().length()-1; i++) {
            number = shiftLeft(number);
            list.add(number);
        }
        // Optionele sorteerstap
        Collections.sort(list);
        return list;
    }

}
