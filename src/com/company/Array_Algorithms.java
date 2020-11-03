package com.company;

import ibadts.*;



public class Array_Algorithms extends Main{

    static void beginning() {

        int []values = {1, 2, 24, 64, 10, 63, 12, 17};
        final  int key = 12;
        int index = 0;
        boolean found = false;
        while (index < values.length && !found) {
            if(values[index] == key) {
                found = true;
                System.out.println(key);
            }
            index++;
        }

        for(int i = 0; i < values.length; i++) {

            if(values[i] == key) {
                System.out.println(values[i]);
            }

        }

        index = 0;
        while (index < values.length) {
            if(values[index] == key) {
                System.out.println(values[index]);
                break;
            }
            index++;
        }



    }

    static int binary_search(int[] array, int key) {

        int first = 0;
        int last = array.length-1;

        while (first <= last) {
            int middle = (first+last)/2;
            if(key < array[middle]) {
                last = middle - 1;
                System.out.println(array[middle]);
            } else if(key > array[middle]) {
                first = middle+1;
                System.out.println(array[middle]);
            } else  if(key == array[middle]) {
                System.out.println(array[middle]);
                return middle;
            }
        }


        return -1;
    }

    static void selection_sort(int []arr) {

       for(int i = 0; i < arr.length-1; i++) {
           int index = i;
           for(int j = i+1; j < arr.length; j++) {
               if(arr[j] < arr[index]) {
                   index = j;
               }
           }
           int smaller_number = arr[index];
           arr[index] = arr[i];
           arr[i] = smaller_number;
       }

    }

    static void bubble_sort(int []arr) {

        int swap;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }


    static void hw2() {

        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        int grade_num = 0;

        for(int i = 0; i < students.length; i++) {
            if(students[i].equals("Charlie")) {
                grade_num = i;
            }
        }
        System.out.println(grades[grade_num]);

    }

    static void hw3() {
        int[] data = {-4, 11, 7, -12, 6, 1};



    }


}
