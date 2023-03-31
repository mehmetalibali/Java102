
import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Ander ", 200, "Dogukan ", 2020));
        books.add(new Book("Kennedy", 112, "Mehmet", 1982));
        books.add(new Book("Michael", 123, "Batu", 2015));

        for (Book book : books) {
            System.out.println(book.getBookName());
        }

        System.out.println("\n-------------------\n");

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage() - o2.getPage();
            }
        });

        books1.addAll(books);

        for (Book book : books1) {
            System.out.println(book.getBookName());
        }

    }
}