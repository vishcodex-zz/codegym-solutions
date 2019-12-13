package com.codegym.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/*
OOP: Books

*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
//        System.out.println(books);
//        System.out.println();
        for(Book b : books)
            System.out.println(b);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String output = null;

            if (author.equals("Agatha Christie")) {
                String agathaChristieOutput = author + ": " + getTitle() + " is a detective";
                System.out.println();
                output = agathaChristieOutput;
            } else if (author.equals("Mark Twain")) {
                String markTwainOutput = getTitle() + " was written by " + author;
                output = markTwainOutput;
            } return output;
        }

//            if (this instanceof AgathaChristieBook) {
//                String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
//                String output = agathaChristieOutput;
//            } else if (this instanceof MarkTwainBook) {
//                String markTwainOutput = getBook().getTitle() + " was written by " + author;
//            }
            //write your code here

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {

        public String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book{

        public String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}