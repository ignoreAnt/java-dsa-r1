package com.aakash.dsa.bit.manipulation.instruction;

public class KthBitSet {
    public static void main(String[] args) {

        //  11001
        //& 01000
        // ------
        //  01000

        //  10001
        //& 01000
        // ------
        //  00000

        // 0001
        // 0010
        // 0100
        // 1000

        // 11001
        // 01100
        // 00110
        // 00011

        System.out.println(isKthBitSet(15, 2));
        System.out.println(isKthBitSetV1(15, 2));
    }

    private static boolean isKthBitSet(int n, int k){
        if (k < 1 || k > 32 || k > n){
            return false;
        }
        System.out.println("Number : " + Integer.toBinaryString(n));
        int mask = 1;
        System.out.println("mask : " + Integer.toBinaryString(mask));
        for (int i = 1; i < k; i++) {
            mask = mask * 2;
            System.out.println("mask : " + Integer.toBinaryString(mask));
        }

        int result = mask & n;
        System.out.println("result : " + Integer.toBinaryString(result));

        if (result == 0){
            return false;
        }else {
            return true;
        }

        // TC : O(K)
        // AS : O(1)
    }

    private static boolean isKthBitSetV1(int n, int k){
        if (k < 1 || k > 32 || k > n){
            return false;
        }
        System.out.println("Number : " + Integer.toBinaryString(n));
        int mask = 1;
        System.out.println("mask : " + Integer.toBinaryString(mask));
//        for (int i = 1; i < k; i++) {
//            mask = mask * 2;
//            System.out.println("mask : " + Integer.toBinaryString(mask));
//        }
        mask = 1 << (k - 1);

        int result = mask & n;
        System.out.println("result : " + Integer.toBinaryString(result));

        if (result == 0){
            return false;
        }else {
            return true;
        }

        // TC : O(1)
        // AS : O(1)
    }
}
