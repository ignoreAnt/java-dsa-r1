package com.aakash.dsa.maths.instrcution;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(9));
    }

    private static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }

        if (num == 2 || num == 3){
            return true;
        }

        if (num % 2 == 0){
            return false;
        }

        for (int i = 3; i * i <= num; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;

        // TC : O(sqrt(n))
        // AS : O(1)
    }

    private static boolean isPrimeV1(int num){
        if (num <= 1){
            return false;
        }

        if (num == 2 || num == 3){
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0){
            return false;
        }

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }

        return true;

        // TC : O(sqrt(n))
        // AS : O(1)
    }
}
