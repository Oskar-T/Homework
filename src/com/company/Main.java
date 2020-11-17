package com.company;

import com.company.homework.Point;
import ibcsutils.Book;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(3, 2);
        Point b = new Point(7, 8);
        System.out.println(Point.getDistance(a, b));


    }
}
