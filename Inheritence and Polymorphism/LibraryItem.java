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

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Price: " + price);
    }
}

class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, LocalDate publicationDate, double price, int numberOfPages) {
        super(title, author, publicationDate, price);
        this.numberOfPages = numberOfPages;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

class Magazine extends LibraryItem {
    private String publisher;

    public Magazine(String title, String author, LocalDate publicationDate, double price, String publisher) {
        super(title, author, publicationDate, price);
        this.publisher = publisher;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Publisher: " + publisher);
    }
}

class Journal extends LibraryItem {
    private String ISSN;

    public Journal(String title, String author, LocalDate publicationDate, double price, String ISSN) {
        super(title, author, publicationDate, price);
        this.ISSN = ISSN;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("ISSN: " + ISSN);
    }
}

class Library {
    public void displayItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.displayItemDetails();
            System.out.println();
        }
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("Java Programming", "John Smith", LocalDate.of(2020, 1, 1), 29.99, 500);
        items[1] = new Magazine("Tech Today", "Tech Publications", LocalDate.of(2023, 6, 1), 9.99, "XYZ123");
        items[2] = new Journal("Science Journal", "ABC Publications", LocalDate.of(2022, 12, 15), 49.99, "ISSN789");
        library.displayItems(items);
    }
}
