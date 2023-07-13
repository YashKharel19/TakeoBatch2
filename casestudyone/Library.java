package today;

import java.util.ArrayList;
import java.util.List;

//    - Properties: books, borrowers, transactions 

//    - Methods: 

//      - addBook(Book book): Adds a book to the library's collection. 

//      - removeBook(Book book): Removes a book from the library's collection. 

//      - addBorrower(Borrower borrower): Adds a borrower to the library's records. 

//      - removeBorrower(Borrower borrower): Removes a borrower from the library's records. 

//      - issueBook(Book book, Borrower borrower): Issues a book to a borrower, updating the book's availability status and creating a new transaction record. 

//      - returnBook(Book book): Updates the book's availability status and transaction record when a book is returned. 

//      - getBorrowingHistory(Borrower borrower): Retrieves the borrowing history of a borrower. 

public class Library {

    private List<Book> books;

    private List<Borrower> borrowers;

    private List<Transaction> transactions;

    public Library() {

        this.books = new ArrayList<>();

        this.borrowers = new ArrayList<>();

        this.transactions = new ArrayList<>();

    }

    public void addBook(Book book) {

        books.add(book);

    }

    public void removeBook(Book book) {

        books.remove(book);

    }

    public void addBorrower(Borrower borrower) {

        borrowers.add(borrower);

    }

    public void removeBorrower(Borrower borrower) {

        borrowers.remove(borrower);

    }

    public void issueBook(Book book, Borrower borrower, String issueDate) {

        if (book.getStatus()) {

            Transaction transaction = new Transaction(book, borrower, issueDate);

            transactions.add(transaction);

            borrower.getHistory().add(transaction);

            book.setStatus(false);

            System.out.println("Book '" + book.getTitle() + "' issued to " + borrower.getName() + ".");

        } else {

            System.out.println("Book '" + book.getTitle() + "' is not available for borrowing.");

        }

    }

    public void returnBook(Book book) {

        for (Transaction transaction : transactions) {

            if (transaction.getBook() == book && transaction.getReturnDate() == null) {

                transaction.setReturnDate("current_date"); // Replace "current_date" with the actual return date

                book.setStatus(true);

                System.out.println("Book '" + book.getTitle() + "' returned.");

                return;

            }

        }

        System.out.println("Book '" + book.getTitle() + "' is not currently on loan.");

    }

    public List<Transaction> getHistory(Borrower borrower) {

        return borrower.getHistory();

    }

}
