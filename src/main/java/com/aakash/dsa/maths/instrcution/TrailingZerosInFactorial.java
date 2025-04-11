package com.aakash.dsa.maths.instrcution;

import java.math.BigInteger;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {

        System.out.println(trailingZeros(5));
        System.out.println(trailingZeros(10));
//        System.out.println(trailingZeros(100));

        System.out.println(trailingZerosV1(5));
        System.out.println(trailingZerosV1(20));
        System.out.println(trailingZerosV1(25));
        System.out.println(trailingZerosV1(50));
        System.out.println(trailingZerosV1(100));
    }
    /*
     5! = 120 // 1 zero
     10! = 3628800 // 2 zeros
     20! = 2432902008176640000 // 4 zeros
     20! = 20 * 19 * 18 * 17 * 16 * 15 * ... 10 * ... * 5 ...* 1
     25! = 15511210043330985984000000 // 5 zeros
     50! = 30414093201713378043612608166064768844377641568960512000000000000 // 10 zeros
     */
    public static int trailingZeros(int num){
        if (num < 0){
            throw new IllegalArgumentException("invalid input");
        }

        int fact = factorial(num); // O(n)
        int countZeros = 0;
        while (fact % 10 == 0){
            countZeros++;
            fact /= 10;
        }
                                // O(log(10) * n)
        return countZeros;

        // TC : O(n) + O(log(10) * n) => O(n)
        // AS : O(1)
    }

    public static int factorial(int num){
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;

        // TC : O(n)
        // AS : O(1)
    }

    public static BigInteger factorialV2(int num){
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

    public static int trailingZerosV1(int num){
        if (num < 0){
            throw new IllegalArgumentException("invalid input");
        }

        int countZeros = 0;
        for (int i = 5 ; num/i >= 1; i = i * 5) {
            countZeros += num / i;
        }

        return countZeros;
    }
}
