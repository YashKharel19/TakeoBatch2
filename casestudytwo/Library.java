package casestudytwo;

public class Library {

    public void displayItems(LibraryItem[] items) {

        for (LibraryItem item : items) {

            item.displayItemDetails();

        }

    }

}
