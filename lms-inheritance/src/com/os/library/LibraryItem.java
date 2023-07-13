package com.os.library;

import java.time.LocalDate;

public class LibraryItem {
    protected String title;
    protected String author;
    protected LocalDate publicationDate;
    protected double price;

    public LibraryItem(String title, String author, LocalDate publicationDate, double price) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Publication Date: " + this.getPublicationDate().toString());
        System.out.println("Price: " + this.getPrice());
    }
}
