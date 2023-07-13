package com.os.library;

public class Library {
    private final Book[] books;
    private final Borrower[] borrowers;
    private final Transaction[] transactions;

    public Library() {
        this.books = new Book[3];
        this.borrowers = new Borrower[1];
        this.transactions = new Transaction[1];
    }

    public Book[] getBooks() {
        return this.books;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void addBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                break;
            }
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == book) {
                this.books[i] = null;
            }
        }
    }

    public void addBorrower(Borrower borrower) {
        for (int i = 0; i < this.borrowers.length; i++) {
            if (this.borrowers[i] == null) {
                this.borrowers[i] = borrower;
                break;
            }
        }
    }

    public void removeBorrower(Borrower borrower) {
        for (int i = 0; i < this.borrowers.length; i++) {
            if (this.borrowers[i] == borrower) {
                this.borrowers[i] = null;
                break;
            }
        }
    }

    public void issueBook(Book book, Borrower borrower) {
        if (findBook(book)) {
            if (book.getAvailabilityStatus() == AvailabilityStatus.AVAILABLE) {
                Transaction transaction = new Transaction(book, borrower, "07/13/2023", "07/20/2023");

                for (int i = 0; i < this.transactions.length; i++) {
                    if (this.transactions[i] == null) {
                        this.transactions[i] = transaction;
                    }
                }

                book.setAvailabilityStatus(AvailabilityStatus.UNAVAILABLE);
                borrower.setBorrowingHistory(transaction);

                System.out.println("You have successfully borrowed the book!");
            } else {
                System.out.println("Book is not available for borrowing!");
            }
        } else {
            System.out.println("Book is not in this library.");
        }
    }

    public void returnBook(Book book) {
        // Check if the book is borrowed or not.
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[0].getBook() != book) {
                System.out.println("You can't return a book you didn't borrow.");
                return;
            }
        }

        // Find the transaction.
        Transaction transaction = findTransactionByBook(book);

        if (transaction != null) {
            transaction.setReturnDate(null);
            book.setAvailabilityStatus(AvailabilityStatus.AVAILABLE);
        }
    }

    public Transaction[] getBorrowingHistory(Borrower borrower) {
        // Finding the borrower
        for (int i = 0; i < this.borrowers.length; i++) {
            if (this.borrowers[i] == borrower) {
                return this.borrowers[i].getBorrowingHistory();
            }
        }

        return null;
    }

    private boolean findBook(Book book) {
        boolean isBookInTheLibrary = false;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == book) {
                isBookInTheLibrary = true;
                break;
            }
        }

        return isBookInTheLibrary;
    }

    private Transaction findTransactionByBook(Book book) {
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i].getBook() == book) {
                return this.transactions[i];
            }
        }

        return null;
    }
}
