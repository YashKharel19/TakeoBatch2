import com.os.library.*;

public class Main {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book("Lord of the Rings", "J.R.R. Tolkien", "123456789", "Fantasy", AvailabilityStatus.AVAILABLE);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", "987654321", "Fantasy", AvailabilityStatus.UNAVAILABLE);

        Borrower borrower = new Borrower("John Doe", "123 Main St.", "555-555-5555");

        Library library = new Library();

        library.addBook(lordOfTheRings);
        library.addBook(harryPotter);
        library.addBorrower(borrower);

        library.issueBook(lordOfTheRings, borrower);

        // Check if books availability status changed or not.
        for (Book book : library.getBooks()) {
            if (book != null) {
                System.out.println(book.getAvailabilityStatus());
            }
        }

        System.out.println("--------------------");

        // Check if borrowers browsing history updated or not.
        for (Transaction transaction: library.getBorrowingHistory(borrower)) {
            if (transaction != null) {
                System.out.println(transaction);
            }
        }

        library.returnBook(lordOfTheRings);

        // Check transaction
        System.out.println("--------------------");
        for (Transaction transaction: library.getTransactions()) {
            if (transaction != null) {
                System.out.println(transaction);
            }
        }

        System.out.println("--------------------");

        for (Transaction transaction: library.getBorrowingHistory(borrower)) {
            if (transaction != null) {
                System.out.println(transaction);
            }
        }
    }
}
