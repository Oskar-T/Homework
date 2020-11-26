package com.company;

import com.company.ClassRelationship.Project;
import com.company.ClassRelationship.Task;
import com.company.ClassRelationship.Worker;
import com.company.product.Order;
import com.company.product.Warehouse;

public class Main {

    public static void main(String[] args) {

        final int N = 4;
        int[] bits = new int [N];
        for (bits [0] = 0; bits [0] <= 1; bits [0]++) {
            for (bits[1] = 0; bits[1] <= 1; bits[1]++) {
                for (bits[2] = 0; bits[2] <= 1; bits[2]++) {
                    System.out.println(java.util.Arrays.toString(bits));
                }
            }
        }
    }
}
