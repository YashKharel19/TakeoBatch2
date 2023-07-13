package com.os.library;

public class Borrower {
    private String name;
    private String address;
    private String contactNumber;
    private Transaction[] borrowingHistory;

    public Borrower(String name, String address, String contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.borrowingHistory = new Transaction[2];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Transaction[] getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setBorrowingHistory(Transaction transaction) {
        for (int i = 0; i < this.borrowingHistory.length; i++) {
            if (this.borrowingHistory[i] == null) {
                this.borrowingHistory[i] = transaction;
                break;
            }
        }
    }
}
