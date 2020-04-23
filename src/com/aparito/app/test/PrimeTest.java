package com.aparito.app.test;

import com.aparito.app.prime.Prime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeTest {

    @Test
    void primeInput5() {
        List<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5);

        assertEquals(primes, Prime.calculatePrimes(5));
    }

    @Test
    void primeInput50() {
        List<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        primes.add(23);
        primes.add(29);
        primes.add(31);
        primes.add(37);
        primes.add(41);
        primes.add(43);
        primes.add(47);

        assertEquals(primes, Prime.calculatePrimes(50));
    }
}
