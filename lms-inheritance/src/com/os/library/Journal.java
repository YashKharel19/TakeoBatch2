package com.os.library;

import java.time.LocalDate;

public class Journal extends LibraryItem {
    private String ISSN;
    public Journal(String title, String author, LocalDate publicationDate, double price, String ISSN) {
        super(title, author, publicationDate, price);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
