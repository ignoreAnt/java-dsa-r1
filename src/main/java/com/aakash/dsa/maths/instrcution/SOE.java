package com.aakash.dsa.maths.instrcution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class SOE {
    public static void main(String[] args) {
        System.out.println(soe(10));
    }

    private static List<Integer> soe(int num){
        List<Integer> result = new ArrayList<>();

        if (num <= 1){
            return result;
        }

        boolean[] primes = new boolean[num + 1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
//        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= primes.length; i++) {  // 2, 3, 4, upto num
           if (primes[i]){
               for (int j =  i * i ; j <= primes.length; j += i) {
                   primes[j] = false;
               }
           }
        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i]){
                result.add(i);
            }
        }


        return result;

        // TC :
        // AS : O(n)
    }
}
