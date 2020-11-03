package com.company;

import ibadts.*;



public class Array_Algorithms extends Main{

    static int sequential_search(int []arr, int key) {

        for(int i = 0; i < arr.length; i++) {
            System.out.println("key found: " + (arr[i] == key));
            if(arr[i] == key) {
                return key;
            }
        }
        return -1;
    }

    static int binary_search(int[] arr, int key) {

        int first = 0;
        int last = arr.length-1;
        int middle = (first+last)/2;

        while (first <= last) {

            if (key > arr[middle]) {
                System.out.println("key found: " + (arr[middle] == key));
                first = middle+1;
            }  else if (key < arr[middle]) {
                System.out.println("key found: " + (arr[middle] == key));
                last = middle - 1;
            }  else if(arr[middle] == key){
                System.out.println("key found: " + (arr[middle] == key));
                break;
            }

            middle = (first + last) / 2;
        }
        return middle;

    }

    static void selection_sort(int []arr) {


        int swap;
        for(int i = 0; i < arr.length-1; i++) {
            int index = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[index] > arr[j]) {
                  index = j;
                }
            }
            swap = arr[index];
            arr[index] = arr[i];
            arr[i] = swap;

            for(int k : arr) {
                System.out.println(k);
            }
            System.out.println("");
        }



    }

    static void bubble_sort(int []arr) {

        int swap;
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                  swap = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = swap;
                }
            }
            for(int k : arr) {
                System.out.println(k);
            }
            System.out.println("");
        }

    }

    static void hw1() {

        final int key = 13;
        int[] array = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        System.out.println("Sequential search:  ");
        sequential_search(array, 15);
        System.out.println("Binary search  ");
        binary_search(array, 15);

    }

    static void hw2() {

        String key = "Charlie";
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        int key_index = -1;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(key)) {
                key_index = i;
            }
        }
        System.out.println(grades[key_index]);

    }

    static void hw3() {

        int[] data = {-4, 11, 7, -21, 6, 1};
        System.out.println("------------------");
        selection_sort(data);
        System.out.println("------------------");
        bubble_sort(data);
        System.out.println("------------------");

    }

    static void hw4() {



    }


}
