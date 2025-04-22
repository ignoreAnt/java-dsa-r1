package com.aakash.dsa.maths.instrcution;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(98, 56));
        System.out.println(gcdV1(98, 56));
        System.out.println(gcdV2(98, 56));
    }

    /*
        |gcd(42, 56)    |
        |gcd(98, 56)    |
        |main           |
        -----------------
     */
    private static int gcd(int a, int b) {
        if (a == b){
            return a;
        }

        if (a > b){
            return gcd(a - b, b);
        }

        return gcd(a, b - a);
    }

    public static int gcdV1(int a, int b){
        if (b == 0){
            return a;
        }

        return gcdV1(b, a % b);
    }

    public static int gcdV2(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
