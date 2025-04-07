package com.aakash.dsa.maths.complete;
/*
Given an integer n, write a program to return the count of digits in this number.
The program should handle both positive and negative integers, as well as zero.

Input:

An integer n.

Output:

An integer representing the count of digits in n.

Constraints:

-10^9 ≤ n ≤ 10^9 (to ensure the input is within reasonable bounds for computation).

Examples:

Input: n = 1567
Output: 4
Explanation: The digits in 1567 are 1, 5, 6, 7. Hence, the count is 4.

Input: n = -255
Output: 3
Explanation: The digits in -255 are 2, 5, 5. The negative sign does not count as a digit. Hence, the count is 3.

Input: n = 0
Output: 1
Explanation: The number 0 has one digit, which is 0.
 */
public class CountDigits {
    public static void main(String[] args) {
        int n1 = 1567;
        int n2 = -255;
        int n3 = 0;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(countDigits(n1));
        System.out.println(countDigits(n2));
        System.out.println(countDigits(n3));
        System.out.println();

        System.out.println(countDigitsV1(n1));
        System.out.println(countDigitsV1(n2));
        System.out.println(countDigitsV1(n3));
        System.out.println();

        System.out.println(countDigitsV2(n1));
        System.out.println(countDigitsV2(n2));
        System.out.println(countDigitsV2(n3));
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0){
            num = Math.abs(num);
        }

        int count = 0;
        while (num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    static int countDigitsV1(int num){
        if (num == 0){
            return 1;
        }

        if (num == Integer.MIN_VALUE){
            return 10;
        }

        num = Math.abs(num);

//        int logarithm = (int) Math.log10(num);
        int logarithm = (int) Math.floor(Math.log10(num));

        return logarithm + 1;


    }

    static int countDigitsV2(int num){
        if (num == 0){
            return 1;
        }

        if (num == Integer.MIN_VALUE){
            return 10;
        }

        String stringNum = Integer.toString(Math.abs(num));

        return stringNum.length();
    }
}
