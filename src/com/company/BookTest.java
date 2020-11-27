package com.company;

public class BookTest {

    public static void main(String[] args) {


        Book myBook = new Book("Alexander Pushkin", "Onegin", 1833, "novel");
        System.out.println(myBook);


        myBook.setAuthor("Prist");
        myBook.setName("Overturned world");
        myBook.setYear(1974);
        myBook.setGenre("novel");
        System.out.println("\n" + myBook);

    }

}
