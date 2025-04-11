package com.aakash.dsa.maths.complete;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(10, 5));
    }

    private static int gcd(int a, int b) {
        // base case, when numbers are equal, return either one of them
        if (a == b){
            return a;
        }

        // When a is greater than b, call recursively gcd of (a-b, b)
        if (a > b){
            return gcd(a - b, b);
        }

        // When b is greater than a , call recursively gcd of (a, b-a)
        return gcd(a, b - a);
    }

    private static int gcdV1(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcdV1(b, a % b);
    }

    private static int gcdV2(int a, int b) {
       return b == 0 ? a : gcdV2(b, a % b);
    }

    private static int gcdV3(int a, int b) {

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;  // a = b, b = a % b
        }

        return a;
    }
}
