package com.company;

public class Book {

    private String author;
    private String appellation;
    private int yearofwrit;

    public Book() {

    }

    public Book(String author, String appellation, int yearofwrit) {
        this.appellation = appellation;
        this.author = author;
        this.yearofwrit = yearofwrit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public int getYearofwrit() {
        return yearofwrit;
    }

    public void setYearofwrit(int yearofwrit) {
        this.yearofwrit = yearofwrit;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", appellation='" + appellation + '\'' +
                ", yearofwrit=" + yearofwrit +
                '}';
    }
}
