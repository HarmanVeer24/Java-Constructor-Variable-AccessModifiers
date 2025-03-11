import java.util.Scanner;

public class Book {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book Title");
        String bookTitle = sc.nextLine();
        System.out.println("Enter book Author");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter book Price");
        int bookPrice = sc.nextInt();
        //default object creation
        bookDetails book1 = new bookDetails();
        System.out.println("Default Output");
        book1.displayBookDetails();
        //parameterized object creation
        bookDetails book2 = new bookDetails(bookTitle,bookAuthor,bookPrice);
        System.out.println("Parameterized Output");
        book2.displayBookDetails();

        sc.close();
    }
}
//defining the bookDetails class
class bookDetails{
    String bookTitle;
    String bookAuthor;
    int bookPrice;
    //default constructor
    public bookDetails(){
        this.bookTitle = "Default Value";
        this.bookAuthor = "Default Value";
        this.bookPrice = 0;
    }
    //constructor to initialise the details
    public bookDetails(String bookTitle,String bookAuthor,int bookPrice){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    // display method to display the book information
    public  void displayBookDetails(){
        System.out.println("Title of books is: "+bookTitle);
        System.out.println("Author of books is: "+bookAuthor);
        System.out.println("Price of books is: "+bookPrice);
    }
}
//input
//Enter book Title
//Six Of Crows
//Enter book Author
//Leigh Bardugo
//Enter book Price
//500
//Default Output
//Title of books is: Default Value
//Author of books is: Default Value
//Price of books is: 0
//Parameterized Output
//Title of books is: Six Of Crows
//Author of books is: Leigh Bardugo
//Price of books is: 500
