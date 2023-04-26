package com.finder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CircularPrimeFinderTest {

    @Test
    void testPrime() {
        assert(CircularPrimeFinder.isPrime(3));
        assert(CircularPrimeFinder.isPrime(13));
        assert( ! CircularPrimeFinder.isPrime(4));
        assert(CircularPrimeFinder.isPrime(5));
        assert( ! CircularPrimeFinder.isPrime(6));
        assert(CircularPrimeFinder.isPrime(7));
        assert( ! CircularPrimeFinder.isPrime(8));
    }

    @Test
    void testShiftLeft() {
        assert(CircularPrimeFinder.shiftLeft(123) == 231);
        assert(CircularPrimeFinder.shiftLeft(231) == 312);
        assert(CircularPrimeFinder.shiftLeft(312) == 123);
        assert(CircularPrimeFinder.shiftLeft(12345) == 23451);
        assert(CircularPrimeFinder.shiftLeft(2) == 2);
        assert(CircularPrimeFinder.shiftLeft(56) == 65);
    }

    @Test
    void testShiftRight() {
        assert(CircularPrimeFinder.shiftRight(123) == 312);
        assert(CircularPrimeFinder.shiftRight(231) == 123);
        assert(CircularPrimeFinder.shiftRight(312) == 231);
        assert(CircularPrimeFinder.shiftRight(12345) == 51234);
        assert(CircularPrimeFinder.shiftRight(2) == 2);
        assert(CircularPrimeFinder.shiftRight(56) == 65);
    }

    @Test
    void testRotation() {
        assert(CircularPrimeFinder.giveRotations(123).equals(Arrays.asList(123, 231, 312)));
        assert(CircularPrimeFinder.giveRotations(2).equals(Arrays.asList(2)));
        assert(CircularPrimeFinder.giveRotations(51).equals(Arrays.asList(16,51)));
    }

}
