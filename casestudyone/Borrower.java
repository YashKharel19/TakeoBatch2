package today;

import java.util.ArrayList;
import java.util.List;

public class Borrower {

    private String name;
    private String address;
    private String contactNumber;
    private List<Transaction> history;

    public Borrower(String name, String address, String contactNumber) { 

        this.name = name; 

        this.address = address; 

        this.contactNumber = contactNumber; 

        this.history = new ArrayList<>(); 

    } 

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    } 

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    } 

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String getConatctNumber(){
        return contactNumber;
    } 

    public List<Transaction> getHistory() { 

        return history; 

    } 

 

    public void setHistory(List<Transaction> history) { 

        this.history = history; 

    } 
    
}
