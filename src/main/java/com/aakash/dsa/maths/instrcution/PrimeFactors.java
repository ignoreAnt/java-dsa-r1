package com.aakash.dsa.maths.instrcution;

public class PrimeFactors {
    public static void main(String[] args) {
        primeFactors(12);
        System.out.println();
        primeFactors(315);
    }

    private static void primeFactors(int num){
        if (num <= 1){
            return;
        }

        int i = 2;
        while (num > 1){
            if (num % i == 0){
                System.out.println(i);
                num = num / i;
            }else {
                i++;
            }
        }

        // TC : O()
        // AS : O(1)
    }


    private static void primeFactorsV1(int num){
        if (num <= 1){
            return;
        }

        while (num % 2 == 0){
            System.out.println(2);
            num = num / 2;
        }

        while (num % 3 == 0){
            System.out.println(3);
            num = num / 3;
        }

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0){
                System.out.println(i);
                num = num / i;
            }
        }
    }
}
