package com.finder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start the program");
        for (Integer i=2; i < 1000; i++) {
            if (CircularPrimeFinder.isPrime(i)) {
                List<Integer> rotations = CircularPrimeFinder.giveRotations(i);
                boolean isCircularPrime = true;
                for (Integer rotation : rotations) {
                    if (CircularPrimeFinder.isPrime(rotation) == false) {
                        isCircularPrime = CircularPrimeFinder.isPrime(rotation);
                    }
                }
                if (isCircularPrime) {
                    System.out.println("Circular prime found with number " + i);
                }
            }
        }
        System.out.println("Stop the program");
    }
}