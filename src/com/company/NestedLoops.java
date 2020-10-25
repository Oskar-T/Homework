package com.company;

public class NestedLoops extends Main {

    static void hw1() {

        for(int q = 1; q <= 5; q++) {
            for (int i = q; i < 5+q; i++) {
                System.out.print(i + " ");
            }

        }
    }

    static void hw2() {
        int[] a = {1,2,3,4,3};
        int[] b = {1,2,3,4,5};
        boolean isEquals = true;
        for(int n = 0; n < a.length; n++) {
            if(a[n] != b[n]) {
                isEquals = false;
            }
        }
        System.out.println(isEquals);

    }

    static void hw3(int[] nums) {

        for(int k = 0; k < 3; k++) {
            for(int l = 0; l < 3; l++) {
                if(k != l) {
                    System.out.println(10 * nums[k] + nums[l]);
                }
            }
        }


    }

    static void hw4_1() {

        for(int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void hw4_2() {

        for(int i = 5; i >= 0; i--) {
            for(int j = i; j < 6; j++) {
                System.out.print("*");
            }
            for(int q = i; q > 0; q--){
                System.out.print("-");
            }
            System.out.println("");
        }

    }

    static boolean hw5 (int[] numbers) {
        int counter = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] != numbers[i+1]) {
                counter++;
            }
        }
        return counter == numbers.length-1;
    }

    static int[] hw6(int a[], int b[]) {

        int[] sym_diff = new int[a.length+b.length];

        int counter = 0;
        int unique_numbers = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i] != b[j]) {
                    counter++;
                }
            }
            if (counter == a.length) {
                sym_diff[unique_numbers] = a[i];
                unique_numbers++;
            }

            counter = 0;
        }

        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i] != a[i]) {
                    counter++;
                }
            }
            if (counter == b.length) {
                sym_diff[unique_numbers] = b[i];
                unique_numbers++;
            }

            counter = 0;
        }

        return sym_diff;
    }

}
