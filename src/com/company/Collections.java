package com.company;

import ibadts.*;

import java.util.Scanner;

public class Collections extends Main {

    static void example_1() {

        int largest = 0;
        IBCollection<Integer> values = new IBCollection<Integer>();
        values.add(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        while (values.hasNext()) {
            if(largest < values.getNext()) {
                largest = values.getNext();
            }
        }

        values.resetNext();
        
        while (values.hasNext()) {
            if(largest * 2/ 2 * 2 > values.getNext()) {
                System.out.println(values.getNext());
            }
        }

    }

    static void hw1() {
        IBCollection<String> names = new IBCollection<String>();
        names.add(new String[]{"John", "Marie"});
        for(int i = 0; i < 3; i++) {
            names.resetNext();
            while (names.hasNext()) {
                System.out.println(names.getNext());
            }
        }
    }

    static void hw2() {

    boolean flag = false;
    Scanner scan = new Scanner(System.in);
    IBCollection<Integer> numbers = new IBCollection<Integer>();
    int t = 0;
    int number;
    while (!flag) {
        number = scan.nextInt();
        if(number <= 0) {
            flag = true;
        } else {
            numbers.addItem(number);
            t = number;
        }
    }


    while (numbers.hasNext()) {
        number = numbers.getNext();
        if(number > t) {
            System.out.println(number);
        }
    }

    }

    static void hw3() {

       IBCollection<Integer> list = new IBCollection<Integer>();
       boolean flag = false;
       int sum = 0;
       int counter = 0;
       int input_number;
       int mean;

       try (Scanner scan = new Scanner(System.in)) {
           while (!flag) {
               input_number = scan.nextInt();
               if(input_number >= 0){
                   list.addItem(input_number);
                   sum+=input_number;
                   counter++;
               } else {
                   flag = true;
               }
           }
       } catch (Exception e) {
           System.out.println("Exception" + e);
       }

       if(!list.isEmpty()) {
           mean = sum/counter;
           while (list.hasNext()) {
               int list_number = list.getNext();
               if(list_number > mean * 1.5 || list_number < mean * 0.5) {
                   System.out.println(list_number);
               }
           }
       } else {
           System.out.println("No data");
       }

    }

}
