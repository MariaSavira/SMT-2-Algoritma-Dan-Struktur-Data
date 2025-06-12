package Praktikum14;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalah Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        System.out.println("\nDengan Looping : ");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nTanpa Looping : ");
        System.out.println(books);

        System.out.println();
        System.out.println(books.search(book2));
    }
}
