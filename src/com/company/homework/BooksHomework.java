package com.company.homework;

import com.company.Main;
import ibcsutils.Book;

public class BooksHomework extends Main {

    public static void hw() {
        String[] author = new String[1];
        author[0] = "Author";

        String[] author2 = new String[1];
        author2[0] = "Author2";

        Book[] books = new Book[2];
        books[0] = new Book("Name", author, 2000);
        books[1] = new Book("Name", author2, 2001);
        for (Book book : books) {
            System.out.println(book);
        }

    }

}
