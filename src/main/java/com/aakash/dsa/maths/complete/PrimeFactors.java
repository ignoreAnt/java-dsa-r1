package com.aakash.dsa.maths.complete;

public class PrimeFactors {
    public static void main(String[] args) {
        primeFactors(20);
        System.out.println();
        primeFactorsV1(20);
    }

    private static void primeFactors(int num) {
        if (num <= 1){
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0){
                System.out.println(i);
                num = num / i;
            }
        }

        if (num > 1){
            System.out.println(num);
        }
    }

    private static void primeFactorsV1(int num) {
        if (num <= 1){
            return;
        }

        while (num % 2 == 0){
            System.out.println(2);
            num = num / 2;
        }

        while (num % 3 == 0){
            System.out.println(3);
            num = num / 3;
        }

        for (int i = 5; i * i <= num; i = i + 6) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }

        if (num > 1){
            System.out.println(num);
        }
    }
}
