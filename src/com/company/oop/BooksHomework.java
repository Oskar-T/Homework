package com.company.oop;

import ibcsutils.Book;

public class BooksHomework {

    public static void hw() {
        String[] author = new String[1];
        author[0] = "Author";

        String[] author2 = new String[1];
        author2[0] = "Author2";

        Book[] books = new Book[2];
        books[0] = new Book("BookName1", author, 2000);
        books[1] = new Book("BookName2", author2, 2001);

        for (Book book : books) {
            System.out.println(book);
        }

    }

}
