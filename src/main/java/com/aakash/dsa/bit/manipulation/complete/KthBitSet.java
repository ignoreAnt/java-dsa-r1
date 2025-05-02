package com.aakash.dsa.bit.manipulation.complete;

public class KthBitSet {
    public static void main(String[] args) {
        System.out.println(kthBitSet(5, 2));
        System.out.println("----");
        System.out.println(kthBitSet(100, 23));
        System.out.println(kthBitSet(100, 7));
        System.out.println("----");
        System.out.println(kthBitSetV1(100, 7));
        System.out.println("----");
        System.out.println(kthBitSetV2(100, 7));
    }

    private static boolean kthBitSet(int n, int k){

        if (k < 1 || k > 32 || k > n){
            return false;
        }
        System.out.println("Number :" + Integer.toBinaryString(n));
        System.out.println("K :" + k);
        int mask = 1;
        System.out.println("Mask :" + Integer.toBinaryString(mask));
        for (int i = 1; i < k; i++) {
            System.out.println("Mask Before Multiplying :" + Integer.toBinaryString(mask));
            mask = mask * 2;
            System.out.println("Mask After Multiplying :" + Integer.toBinaryString(mask));
        }
        System.out.println("Mask after shifting k - 1 times :" + Integer.toBinaryString(mask));
        System.out.println("Number :" + Integer.toBinaryString(n));
        int result = n & mask;
        System.out.println("Result :" + Integer.toBinaryString(result));
        if (result == 0){
            return false;
        }else {
            return true;
        }
    }

    private static boolean kthBitSetV1(int n, int k){
        if (k < 1 || k > 32 || k > n){
            return false;
        }
        System.out.println("Number :" + Integer.toBinaryString(n));
        int mask = 1 << (k - 1);
        System.out.println("Mask :" + Integer.toBinaryString(mask));
        int result = n & mask;
        System.out.println("Result :" + Integer.toBinaryString(result));

        if (result == 0){
            return false;
        }else {
            return true;
        }
    }

    private static boolean kthBitSetV2(int n, int k){
        if (k < 1 || k > 32 || k > n){
            return false;
        }
        System.out.println("Number :" + Integer.toBinaryString(n));
        int shiftedNumber = n >> (k - 1);
        System.out.println("Shifted Number :" + Integer.toBinaryString(shiftedNumber));
        int result = shiftedNumber & 1;
        System.out.println("Result :" + result);
        if (result == 0){
            return false;
        }else {
            return true;
        }
    }
}
