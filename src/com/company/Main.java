package com.company;

import com.company.ClassRelationship.Project;
import com.company.ClassRelationship.Task;
import com.company.ClassRelationship.Worker;
import com.company.product.Order;
import com.company.product.Warehouse;

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



    }
}
