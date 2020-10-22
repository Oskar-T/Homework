package com.company;

public class Main {

    static void hw1() {

        for(int q = 1; q <= 5; q++) {
            for (int i = q; i < 5+q; i++) {
                System.out.print(i + " ");
            }

        }
    }

    static void hw2() {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        boolean isEquals = true;
        for(int n = 0; n < a.length; n++) {
            if(a[n] != b[n]) {
                isEquals = false;
            }
        }
        System.out.println(isEquals);

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

        for(int i = 6; i >= 0; i--) {
            for(int j = i; j < 6;j++) {
                System.out.print("*");
            }
            for(int q = i; q > 0; q--){
                System.out.print("-");
            }
            System.out.println("");
        }

    }

    static boolean unique (int[] numbers) {
        int counter = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] != numbers[i+1]) {
                counter++;
            }
        }
        return counter == numbers.length-1;
    }

    static int[] hw6(int a[], int b[]) {


        return null;
    }


    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,5};
        System.out.println(unique(ar));
        System.out.println();
    }
}
