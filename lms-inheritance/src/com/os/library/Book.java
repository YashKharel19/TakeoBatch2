package com.os.library;

import java.time.LocalDate;

public class Book extends LibraryItem {
    private int numberOfPages;
    public Book(String title, String author, LocalDate publicationDate, double price, int numberOfPages) {
        super(title, author, publicationDate, price);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
