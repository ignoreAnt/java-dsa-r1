package com.aakash.dsa.bit.manipulation.complete;

import java.util.Map;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(5));
        System.out.println(countSetBitsV2(5));
        Map<String, String> map = new java.util.HashMap<>();
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0){
            System.out.println("Number :" + Integer.toBinaryString(n));
            System.out.println("Number & 1 :" + (n & 1));
            if ((n & 1) == 1){
                count++;
            }
            n = n >> 1;
            System.out.println("Number After Shifting :" + Integer.toBinaryString(n));
        }
        return count;
    }

    private static int countSetBitsV2(int n) {
        int count = 0;
        System.out.println("Number :" + Integer.toBinaryString(n));
        while (n > 0){
            System.out.println("Number inside loop :" + Integer.toBinaryString(n));
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    private static int countSetBitsV3(int n) {
        int count = 0;
        return count;
    }
}
