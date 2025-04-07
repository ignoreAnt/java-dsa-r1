package com.aakash.dsa.maths.complete;
/*
Given an integer n, determine whether the number is a palindrome.
A number is considered a palindrome if it remains the same when its digits are reversed.

Input:

An integer n (can be positive, negative, or zero).

Output:

Return true if n is a palindrome, otherwise return false.

Constraints:

-2^31 <= n <= 2^31 - 1 (standard 32-bit integer range).

Examples:

Input: n = 12321
Output: true
Explanation: Reversing 12321 gives 12321, which matches the original number.

Input: n = 1234
Output: false
Explanation: Reversing 1234 gives 4321, which does not match the original number.

Input: n = -121
Output: false
Explanation: Negative numbers are not palindromes because the - sign makes them asymmetrical.

*/
public class PalindromeNumber {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5};
        System.out.println(constructNumber(digits));
    }

    static int constructNumber(int[] digits){
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
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }
        return number;
    }

    static boolean isPalindrome(int num){
        int[] digits = new int[10];
        int index = 0;
        while (num != 0){
            digits[index++] = num % 10;
            num = num / 10;
        }

        int reverse = 0;
        for (int i = 0; i < digits.length; i++) {
            reverse = reverse * 10 + digits[i];
        }
        return reverse == num;
    }

    static boolean isPalindromeV1(int num){
        int[] digits = new int[10];
        int index = 0;
        while (num != 0){
            digits[index++] = num % 10;
            num = num / 10;
        }

        int left = 0;
        int right = digits.length - 1;
        while (left < right){
            if (digits[left] != digits[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindromeV2(int num){
        int[] digits = new int[10];
        int index = 0;
        while (num != 0){
            digits[index++] = num % 10; // we extract the last digit by dividing
                                        // the number by 10 and taking the remainder
            num = num / 10;
        }

       for (int i = 0; i < digits.length / 2; i++) {
           if (digits[i] != digits[digits.length - 1 - i]){
               return false;
           }
       }

       return true;
    }

    static boolean isPalindromeV3(int num){
        int reverse = 0;
//        num = Math.abs(num);
        int temp = num;
        while (temp != 0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverse == num;
    }
}
