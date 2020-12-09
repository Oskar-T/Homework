package com.company;

import java.util.*;

public class Lists {

    public static void Example2() {

        System.out.println("Type numbers");

        LinkedList<Integer> list = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            int i = 0;
            while (i < list.size() && list.get(i) > num) {
                i++;
            }
            list.add(i, num);
            System.out.println(list + " i: " + i);
        }
    }

    public static LinkedList merge(LinkedList<String> l1,
                                   LinkedList<String> l2) {

        LinkedList<String> resultList = new LinkedList<>();
        while (!l1.isEmpty() || !l2.isEmpty()) {
            LinkedList<String> chosen; //from which list do we take next el
            if(l1.isEmpty()) {
                chosen = l2;
            } else if(l2.isEmpty()) {
                chosen = l1;
            } else {

                if(l1.peekFirst().compareTo(l2.peekFirst()) < 0) {
                    chosen = l1;
                } else {
                    chosen = l2;
                }
            }

            resultList.add(chosen.removeFirst());

        }

        return resultList;

    }

    public static void Homework1() {

        System.out.println("1. don't have capacity");
        System.out.println("2. have special methods");
        System.out.println("3. have special iterator");
        System.out.println("4. easy to remove or add elements");

        System.out.println("\n" + "1. Can be of any type, including primitive datatypes");
        System.out.println("2. Faster to access special element, as it does not have links");

        System.out.println("\n" + "List is a type of Collection, but in Collection you can add and remove elements");
    }

    public static void Homework2() {

        System.out.println("1");
        System.out.println("1, 6");
        System.out.println("1, 0, 6");
        System.out.println("1, 0");
        System.out.println("0");

    }

    public static void Homework3() {

        LinkedList<String> list = new LinkedList<String>();
        String word;
        Scanner scan = new Scanner(System.in);

        while (!(word = scan.next()).equals("!")) {
            list.add(word);
        }

        while (!(word = scan.next()).equals("!") && !list.isEmpty()) {
            if(list.removeFirst().equals(word)) {
                System.out.println("hit");
            }
        }

    }

    public static void Homework4() {

        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        while (scan.hasNextInt()) {

            int num = scan.nextInt();
            if(!list.contains(num)) {
                list.addFirst(num);
            } else if(list.contains(num)) {
                list.removeFirstOccurrence(num);
                list.addFirst(num);
            }

        }
        System.out.println(list);

    }

    public static void Homework5() {

        System.out.println("On github: https://github.com/Oskar-T/hw5_lists/tree/master/src/com/company");

    }

    public static LinkedList<Integer> flatten (LinkedList<LinkedList<Integer>> list) {

        LinkedList<Integer> flattened = new LinkedList<Integer>();

        for(int i = 0; i < list.size(); i++) {
            ListIterator inner_lt = list.get(i).listIterator();
        while (inner_lt.hasNext()) {
                flattened.add(list.get(i).removeFirst());
            }
        }

        return flattened;
    }


}

