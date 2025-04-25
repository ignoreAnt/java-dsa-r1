package com.aakash.dsa.maths.instrcution;

import java.util.ArrayList;
import java.util.List;

public class DivisorOfNumber {
    public static void main(String[] args) {
        divisors(100);
        System.out.println();
        divisorsV1(100);

        System.out.println(divisorsV2(100));
    }

    private static void divisors(int num){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }

        // TC: O(n)
        // AS : O(1)
    }

    private static void divisorsV1(int num){
        System.out.println(1);
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(num);

        // TC : O(n)
        // AS : O(1)
    }

    private static List<Integer> divisorsV2(int num){
        List<Integer> smallDivisors = new ArrayList<>();
        List<Integer> largeDivisors = new ArrayList<>();

        smallDivisors.add(1);
        largeDivisors.add(num);
        for (int i = 2; i * i <= num; i++) { // sqrt(n)
            if (num % i == 0){
                smallDivisors.add(i);
                if (num/ i != i) {
                    largeDivisors.add(num / i);
                }
            }
        }

        largeDivisors =  largeDivisors.reversed(); // 1/2 * sqrt(n)
        smallDivisors.addAll(largeDivisors); // 1/2 * sqrt(n)


        return smallDivisors;
        // TC : O(sqrt(n)) + O(1/2 * sqrt(n)) + O(1/2 * sqrt(n)) ==> 2 * O(sqrt(n)) => O(sqrt(n))
        // AS : O(sqrt(n))
    }


}
