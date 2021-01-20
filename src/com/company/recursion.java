package com.company;

public class recursion {

    public static int Example2(int n) {

        if (n > 1) {
            return n + Example2(n - 1);
        } else {
            return 1;
        }

    }

    public static boolean sumTo(int target,
                                int[] numbers,
                                int index) {

        if (target == 0) {
            return true;
        }
        if (index >= numbers.length) {
            return false;
        }
        // either include
        if (sumTo(target - numbers[index], numbers, index + 1)) {
            System.out.println(numbers[index] + " ");
            return true;
        }
        // or not
        return sumTo(target, numbers, index + 1);
    }

    public static int F(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * F(n - 1);
        }

    }

    public static int F2(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }

    public static int T(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return T(n - 1) + ((n - 1) * T(n - 2));
        }

    }

    public static int hw4(int[] arr, int key, int index) {

        if (arr[index] == key) {
            return index;
        } else if (index >= arr.length) {
            return -1;
        } else {
            return hw4(arr, key, index + 1);
        }
    }

    public static boolean isPalindrome(int[] arr, int first, int last, int counter) {

        if (counter == 0) {
            return true;
        } else if (arr[first] == arr[last]) {
            return isPalindrome(arr, first += 1, last -= 1, counter -= 1);
        } else {
            return false;
        }
    }



}
