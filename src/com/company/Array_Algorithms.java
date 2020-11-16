package com.company;

import java.util.Random;

public class Array_Algorithms extends Main {

    static int sequential_search(int []arr, int key) {

        for(int i = 0; i < arr.length; i++) {
            System.out.println("key found: " + (arr[i] == key));
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int binary_search(int[] arr, int key) {

        int first = 0;
        int last = arr.length-1;
        int middle = (first+last)/2;

        while (first <= last) {
            middle = (first + last) / 2;
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
            System.out.println(middle);

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

            for(int k: arr) {
                System.out.println(k);
            }

            System.out.println("");
        }
        System.out.println(Runtime.version());

    }

    static void bubble_sort(int []arr) {


        int swap;
        boolean changed = true;
        int correct = 0;
        while (changed) {
            changed = false;
            for (int j = 0; j < arr.length - 1 - correct; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    changed = true;
                }
            }
            correct++;
        }
            System.out.println("");


    }

    static void hw1() {

        final int key = 13;
        int[] array = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        System.out.println("Sequential search: ");
        sequential_search(array, 15);
        System.out.println("Binary search ");
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
        System.out.println("<------------------>");
        selection_sort(data);
        System.out.println("<------------------>");
        bubble_sort(data);
        System.out.println("<------------------>");

    }

    static int sequentialSearchStr(String []arr, String key) {

        int counter = 0;
        boolean found = false;
        while (!found) {
            if(arr[counter].equals(key)) {
                found = true;
                return counter;
            }
            counter++;
        }

        return -1;
    }

    static int binarySearchStr(String[] arr, String key) {

        int first = 0;
        int last = arr.length-1;
        int middle = (first+last)/2;

        while (first <= last) {

            if (key.compareTo(arr[middle]) > 0) {
                first = middle+1;
            }  else if (key.compareTo(arr[middle]) < 0) {
                last = middle - 1;
            }  else if(arr[middle].equals(key)){
                break;
            }

            middle = (first + last) / 2;
        }
        return middle;

    }

    static void hw4() {

        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr);
        System.out.println(sequentialSearchStr(words, "able"));
        System.out.println(binarySearchStr(words, "able"));
    }

    static void hw5(int[] arr) {


        int n = arr.length;
        int i = 1;
        int val;
        while (i < n) {

            val = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > val) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
            i++;
        }

    }

    static void hw6() {
        System.out.println("Homework 6 is one the handout and I forgot it at home");

    }

    public static void swap(int index1, int index2, String[] arr) {
        String swap;
        swap = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = swap;

    }

    public static void selection_sort_str(String[] arr, int bound) {

        int index;
        for(int i = 0; i < bound-1; i++) {
            index = i;
            for(int j = i + 1; j < bound; j++) {
                if(arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            swap(i, index, arr);
        }

    }


    static String[] getAddress() {

        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr);
        return words;

    }

    static void shuffle(String[] words, int n) {

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int a = rand.nextInt(n);
            swap(a, i, words);
        }

    }

    static void hw7(int n) {

        String[] words = getAddress();
        shuffle(words, n);

        for(int i = 0; i <= n; i+=5000) {
            long start = System.currentTimeMillis();
            selection_sort_str(words, i);
            long timeWent = System.currentTimeMillis() - start;
            System.out.println(i + " " + timeWent);
        }
    }
}


