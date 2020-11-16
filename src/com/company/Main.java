package com.company;

import com.company.homework.Point;
import ibcsutils.Book;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(3, 2);
        Point b = new Point(7, 8);
        System.out.println(Point.getDistance(a, b));


        String[] author = new String[1];
        author[0] = "Author";

        String[] author2 = new String[1];
        author2[0] = "Author2";

        Book[] books = new Book[2];
        books[0] = new Book("Name", author, 2000);
        books[1] = new Book("Name", author2, 2001);
        for(Book book : books) {
            System.out.println(book);
        }

    }
}
