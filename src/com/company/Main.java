package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        IntStack intStack = new IntStack(5);
        intStack.push(1);
        System.out.println(intStack);
        intStack.push(2);
        System.out.println(intStack);
        intStack.push(3);
        System.out.println(intStack);
        intStack.push(4);
        System.out.println(intStack);
        intStack.push(5);
        System.out.println(intStack);

        System.out.println(intStack.pop());
        System.out.println(intStack);



    }
}
