package com.company;

import java.util.LinkedList;
import java.util.ListIterator;


public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();

        LinkedList<LinkedList<Integer>> bigList = new LinkedList<LinkedList<Integer>>();

        l1.add(5);
        l1.add(6);

        l2.add(7);
        l2.add(8);

        bigList.add(l1);
        bigList.add(l2);

        System.out.println(Lists.flatten(bigList));


        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(11);
        linkedList.add(7);

        ListIterator<Integer> lt = linkedList.listIterator();

        lt.add(20);
        lt.next();
        lt.remove();
        lt.next();
        lt.set(15);
        lt.next();
        lt.remove();
        lt.remove();
        System.out.println(linkedList);

    }
}
