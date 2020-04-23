package com.aparito.app.prime;

import java.util.ArrayList;

public class Prime {

    /**
     * Alg ripped from: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     *
     * @param maximumPrime - the maximum number to generate primes until.
     *
     * @return a List of prime numbers.
     */
    public static ArrayList<Integer> calculatePrimes(int maximumPrime) {
        ArrayList<Integer> primeValues = new ArrayList<Integer>();

        boolean[] booleanValues = new boolean[maximumPrime + 1];
        for (int i = 2; i <= Math.sqrt(maximumPrime); i++) {
            //Inverted boolean logic to remove the necessity of flipping all default boolean values to true.
            if (booleanValues[i] == false) {

                for (int j = (int) Math.pow(i, 2); j <= maximumPrime; j = (j + i)) {
                    booleanValues[j] = true;
                }
            }
        }

        //Add linear time complexity onto O(n Log log n).
        for (int i = 2; i < booleanValues.length; i++) {
            if (booleanValues[i] == false) {
                primeValues.add(i);
            }
        }

        return primeValues;
    }
}
