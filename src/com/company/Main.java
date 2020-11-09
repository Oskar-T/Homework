package com.company;



public class Main {

    public static void main(String[] args) {

        int [] arr = {7, 9, 2, 11};
        Array_Algorithms.selection_sort(arr);
        for (int k : arr) {
            System.out.println(k);
        }


    }
}
