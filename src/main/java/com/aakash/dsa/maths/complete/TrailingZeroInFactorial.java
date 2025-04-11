package com.aakash.dsa.maths.complete;

import java.math.BigInteger;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZeros(10));
        System.out.println(trailingZeros(20));
        System.out.println(trailingZeros(100));

        System.out.println(trailingZerosV1(10));
        System.out.println(trailingZerosV1(20));
        System.out.println(trailingZerosV1(100));
    }

    public static int trailingZeros(int num){
        if (num < 0){
            throw new IllegalArgumentException("invalid input");
        }

        BigInteger fact = factorial(num);
        int countZeros = 0;
        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            countZeros++;
            fact = fact.divide(BigInteger.TEN);
        }

        return countZeros;
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

    public static BigInteger factorial(int num){
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
