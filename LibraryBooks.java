// LibraryBook System
public class LibraryBooks {
    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Book object
        BookData book1 = new BookData("Six of Crows", "Leigh Bardugo", 500,true);

        // Display book details
        book1.displayBookDetails();

        // Borrow the book
        book1.borrowBook();

        // Display book details after borrowing
        book1.displayBookDetails();

        // Trying to borrow again
        book1.borrowBook();
    }
}

// Book class
class BookData {
    private String BookTitle;
    private String BookAuthor;
    private double BookPrice;
    private boolean isAvailable;

    // Constructor
    public BookData(String BookTitle, String BookAuthor, double BookPrice, boolean isAvailable) {
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
        this.BookPrice = BookPrice;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + BookTitle);
        } else {
            System.out.println("The book '" + BookTitle + "' is currently not available.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println();
        System.out.println("BookTitle: " + BookTitle);
        System.out.println("BookAuthor: " + BookAuthor);
        System.out.println("BookPrice: " + BookPrice);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
    }
}

//output
//BookTitle: Six of Crows
//BookAuthor: Leigh Bardugo
//BookPrice: 500.0
//Availability: Available
//
//Book borrowed: Six of Crows
//
//BookTitle: Six of Crows
//BookAuthor: Leigh Bardugo
//BookPrice: 500.0
//Availability: Not Available
//
//The book 'Six of Crows' is currently not available.
