package com.company;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Nik Vuychich");
        book.setAppellation("Morning walking");
        book.setYearofwrit(2002);
        System.out.println(book.toString());
        book = new Book("Steven King", "Shining", 1985);
        System.out.println(book.toString());
    }
}
