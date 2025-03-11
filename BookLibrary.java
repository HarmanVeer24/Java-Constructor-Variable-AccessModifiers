public class BookLibrary {
    public static void main(String[] args) {
        // Create a Book class Object
        Book book = new Book("934-612-489-0", "Six of Crows", "Leigh");

        // Display book details
        book.displayBookDetails();

        // Update Author name
        book.setAuthor("Leigh Bardugo");

        // Display book details after updating author name
        System.out.println("After Updating Author Name:");
        book.displayBookDetails();

        // Creating an Ebook Object
        Ebook ebook = new Ebook("341-478-453-1", "Alchemist", "Paulo Coelho", 100);

        // Display Ebook Details
        ebook.displayEbookDetails();
    }
}
class Book {
    public String ISBN;
    protected String title;
    private String author;
    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get author name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

// Child class
class Ebook extends Book {
    // Variable
    private final double SpaceRequired;

    // Constructor for Ebook
    Ebook(String ISBN, String title, String author, double SpaceRequired) {
        super(ISBN, title, author);
        this.SpaceRequired = SpaceRequired;
    }

    // Method to display Ebook details
    public void displayEbookDetails() {
        System.out.println("E-book details: ");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title); // Accessing protected variable from superclass
        System.out.println("Author: " + getAuthor()); // Accessing private variable using getter
        System.out.println("File Size: " + SpaceRequired + " MB");
        System.out.println();
    }
}
//output
//ISBN: 934-612-489-0
//Title: Six of Crows
//Author: Leigh
//
//After Updating Author Name:
//ISBN: 934-612-489-0
//Title: Six of Crows
//Author: Leigh Bardugo
//
//E-book details:
//ISBN: 341-478-453-1
//Title: Alchemist
//Author: Paulo Coelho
//File Size: 100.0 MB

