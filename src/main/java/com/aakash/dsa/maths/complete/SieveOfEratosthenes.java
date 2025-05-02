package com.aakash.dsa.maths.complete;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(soe(10));
        System.out.println(soe(30));
        System.out.println(soe(100));
    }

    public static List<Integer> soe(int num) {
        // Initialize a list to store primes
        List<Integer> primes = new ArrayList<>();

        // Handle the edge case, if the number is lower than 2, return an empty list
        if (num < 2){
            return primes;
        }

        // Step 1: Create a boolean array of size num + 1 and mark all elements as true
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        // Step 2: Mark non-prime numbers as false
        isPrime[0] = false;
        isPrime[1] = false;

        // Step 3: Iterate over the array and mark all multiples of non-prime numbers as false
        for (int i = 2; i * i <= num; i++) {
            // If the current number is prime
            if (isPrime[i]) {
                // Mark all its multiples as non-prime
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 4: Add all prime numbers to the list
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;

    }
}
