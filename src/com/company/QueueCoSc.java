package com.company;

import java.util.Arrays;
import java.util.Scanner;
import ibadts.Queue;
import ibadts.StaticQueue;

public class QueueCoSc {

    public static void example1() {

        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();

        int largest = 0;

        while (scan.hasNextInt()) {
            int i = scan.nextInt();
            queue.enqueue(i);
            if(largest < i) {
                largest = i;
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue()/((double)largest) * 100);
        }

    }

    public static void exampl2_1() {
        Queue queue = new Queue();

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }

    public static void hw1() {

        Queue q = new Queue();
        int counter = 0;
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        while (!q.isEmpty()) {
            q.dequeue();
            counter++;
        }
        System.out.println(counter);


    }

    public static void hw2() {

        int[] numbers = {1, 2, 3};
        StaticQueue queue = new StaticQueue(10);
        int start = 0;
        int end = numbers.length-1;
        boolean beg = true;
        int element;
        while (start <= end && !queue.isFull()) {
            if(beg) {
                element = numbers[start];
                start++;
            } else {
                element = numbers[end];
                end--;
            }
            queue.enqueue(element);
            beg = false;
        }
        System.out.println(queue.toString());
        System.out.println(Arrays.toString(numbers));
    }

    public static void hw4() {

        Queue business = new Queue();
        Queue economy = new Queue();

        for(int i = 1; i < 4; i++) {
            business.enqueue("Business customer № " + i);
            economy.enqueue("Economy customer № " + i);
        }

       while (!business.isEmpty() && !economy.isEmpty()) {

           for (int i = 0; i < 2 && !business.isEmpty(); i++) {
               System.out.println(business.dequeue());
           }
           System.out.println(economy.dequeue());
       }

    }

}












