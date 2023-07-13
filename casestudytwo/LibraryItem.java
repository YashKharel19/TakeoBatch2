package casestudytwo;

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

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String displayItemDetails() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                ", price=" + price +
                '}';
    }

}
