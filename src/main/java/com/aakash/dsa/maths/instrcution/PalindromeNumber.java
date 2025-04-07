package com.aakash.dsa.maths.instrcution;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(1567 % 10);
        System.out.println(1567/10);
        System.out.println(156 % 10);
        System.out.println(156/10);
        System.out.println(15 % 10);
        System.out.println(15/10);
        System.out.println(0 % 10);
        System.out.println(0/10);

         /*
          1234 = 1 * 10^3 + 2 * 10^2 + 3 * 10^1 + 4 * 10^0
          12 = 1 * 10^1 + 2 * 10^0
          124 = 1 * 10^2 + 2 * 10^1 + 4 * 10^0

          So at units place we have 4 * 10^0 = 4 * 1
          at tens place we have 2 * 10^1 = 4 * 10
          at hundreds place we have 1 * 10^2 = 4 * 100

          at every place we have 10^(n-1)
          as we move from right to left we keep multiplying by 10

          so how do represent it in a loop?

         */
        int[] digits = {1, 2, 3, 4};
        // 4321
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = (int) (num + (Math.pow(10, i) * digits[i]));
        }
        System.out.println(num);
        System.out.println(isPalindrome(1234));
    }

    private static boolean isPalindrome(int num){
        int[] digits = new int[10];

        for (int i = 0; i < digits.length && num != 0; i++) {
            int extracted = num % 10;
            digits[i] = extracted;
            num = num / 10;
        }

        System.out.println(Arrays.toString(digits));
        digits = new int[10];
//        int i = 0;
//        while (num != 0){
//            int extracted = num % 10;
//            digits[i] = extracted;
//            i++;
//            num = num / 10;
//        }



        int j = 0;
        for (int i = num; i > 0 ; i = i / 10) {
            int extracted = num % 10;
            digits[j] = extracted;
            j++;
        }
        int start = 0;
        int end = digits.length - 1;
        // 12321
        // 1221
        while (start < end){
            if (digits[start] != digits[end]){
                return false;
            }
            start++;
            end--;
        }
        System.out.println(Arrays.toString(digits));

        return false;
    }

    private static boolean isPalindromeV1(int num){

        if (num < 0){
            return false;
        }
        // 1221
        // 1221 = 1 * 10^3 + 2 * 10^2 + 2 * 10^1 + 1 * 10^0
        int reverse = 0;
        while (num != 0){
            int extracted = num % 10;
            reverse = reverse * 10 + extracted;
            num = num / 10;
        }

        return reverse == num;
    }
}
