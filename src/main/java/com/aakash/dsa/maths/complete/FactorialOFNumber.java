package com.aakash.dsa.maths.complete;

public class FactorialOFNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
        System.out.println(factorialV1(num));
    }

    static int factorial(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    static int factorialV1(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
