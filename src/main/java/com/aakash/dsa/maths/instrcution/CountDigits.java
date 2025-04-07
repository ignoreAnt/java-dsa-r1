package com.aakash.dsa.maths.instrcution;

public class CountDigits {
    public static void main(String[] args) {
        int num = 1567;
        int num1 = -255;
        int num2 = 0;

        System.out.println((int)Math.log10(num) + 1);

        System.out.println(countDigits(num));
        System.out.println(countDigits(num1));
        System.out.println(countDigits(num2));

        System.out.println();

        System.out.println(countDigitsV1(num));
        System.out.println(countDigitsV1(num1));
        System.out.println(countDigitsV1(num2));
        System.out.println();

        System.out.println(countDigitsV3(num));
        System.out.println(countDigitsV3(num1));
        System.out.println(countDigitsV3(num2));
//        System.out.println(1567/10);
//        System.out.println(156/10);
//        System.out.println(15/10);
//        System.out.println(0/10);
    }

    private static int countDigits(int num){
        if (num == 0){
            return 1;
        }

        num = Math.abs(num);
        int count = 0;
        for (int i = num ; i > 0; i = i / 10) {
            count++;
        }

        return count;
    }

    private static int countDigitsV1(int num){
        if (num == 0){
            return 1;
        }

        num = Math.abs(num);
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }

        return count;

        // TC :: O(log n)
        // AS ::O(1)
    }

    private static int countDigitsV2(int num){
        if (num == 0){
            return 1;
        }

        num = Math.abs(num);

//        int result = (int) Math.log10(num) + 1;
        int result = (int) Math.floor(Math.log10(num)) + 1;
        return result;

        // TC: O(1)
        // AS: O(1)
    }

    private static int countDigitsV3(int num){
        if (num == 0){
            return 1;
        }

        int result = Integer.toString(Math.abs(num)).length();
        return result;
    }
}
