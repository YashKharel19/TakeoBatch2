package today;

public class Transaction {

    private Book book;
    private Borrower borrower;
    private String issuedDate;
    private String returnDate;

    public Transaction(Book book, Borrower borrower, String issuedDate) { 

        this.book = book; 

        this.borrower = borrower; 

        this.issuedDate = issuedDate; 

        this.returnDate = null; 

    } 

    public void setBook(Book book){
        this.book = book;
    }

    public Book getBook(){
        return book;
    } 

    public void setBorrower(Borrower borrower){
        this.borrower = borrower;
    }

    public Borrower getBorrower(){
        return borrower;
    } 

    public void setIssuedDate(String issuedDate){
        this.issuedDate = issuedDate;
    }

    public String getIssuedDate(){
        return issuedDate;
    } 

    public void setReturnDate(String returnDate){
        this.returnDate = returnDate;
    }

    public String getReturnDate(){
        return returnDate;
    } 
    
}
