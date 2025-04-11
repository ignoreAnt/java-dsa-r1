package com.aakash.dsa.maths.instrcution;

public class Factorial {
    public static void main(String[] args) {
        // f(n) = n * f(n-1); n = 0; f(0) = 1
        System.out.println(factorial(5));
        System.out.println(factorial(19));
        System.out.println(factorialV1(19));

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(max + 1);
        System.out.println(max + 2);
        System.out.println(min);
    }

    public static int factorial(int num){
        if (num == 0){
            return 1;
        }

        return num * factorial(num - 1);
        // TC : O(n)
        // AS : O(n)
    }

    public static int factorialV1(int num){
        if (num < 0){
            throw new IllegalArgumentException("Negative number doesn't have a factorial");
        }

        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;

        // TC : O(n)
        // AS : O(1)
    }


}
