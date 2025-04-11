package com.aakash.dsa.maths.complete;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(10, 5));
        System.out.println(lcm(14, 49));
        System.out.println(lcmV1(10, 5));
        System.out.println(lcmV1(14, 49));
    }

    private static int lcm(int a, int b) {
        // Handle the edge case when one of the number is 0
        if (a == 0 || b == 0){
            return 0;
        }

        // Define the range of possible LCM values
        int start = Math.max(a, b); // Start from the greater number
        int end = a * b; // End at the product of the two numbers

        // Iterate over the range to find the LCM
        for (int i = start; i <= end; i++) {
            if (i % a == 0 && i % b == 0){
                return i; // Return the first number that is divisible by both
            }
        }

        // If no LCM is found, return -1
        return -1;
    }

    private static int lcmV1(int a, int b) {
        if (a == 0 || b == 0){
            return 0;
        }
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
