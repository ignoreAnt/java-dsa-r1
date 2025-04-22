package com.aakash.dsa.maths.instrcution;

import static com.aakash.dsa.maths.instrcution.GCD.gcdV2;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(9, 6));
        System.out.println(lcm(1, 1));
    }

    private static int lcm(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }

        int start = Math.max(a, b); // 9
        int end = a * b; // 54

        for (int i = start; i <= end; i++) {
            if (i % a == 0 && i % b ==  0){
                return i;
            }
        }

        return -1;

        // TC : O(a * b)
        // AS : O(1)
    }

    private static int lcmV1(int a, int b){
        return  a * b/ gcdV2(a, b);

        // TC : O(log(min(a, b)))
        // AS : O(1)
    }
}
