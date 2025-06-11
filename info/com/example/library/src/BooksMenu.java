//Provide a Menu: change a command line app to manage books allowing the user to select the constructor.
import java.util.Scanner; //Allows the program to use the Scanner class for taking input from the user.


public class BooksMenu {
    
    //Basic
    /*
    private static Book getExpensiveBook(Book book1, Book book2) {
        if (book1.getPrice()<book2.getPrice()) {
            return book2;
        } else {
            return book1;
        }
    }
    */
    //Enhanced
    private static void compareBooks(Book book1, Book book2) {
        if (book1.equals(book2)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are not the same");
        }
    }

    //Enhanced: add Exception
    public static void main(String s[]) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in); //Used to read user input from the console.
        Book[] books = new Book[10]; //Creates an array of size 10 to store up to 10 Book objects. At a later point when you learn about collections, you can replace the fixed size array with an expandable collection.
        int bkIdx = 0;
        while(true) { //The program runs an infinite loop to continuously display the menu until the user chooses to exit. The program prompts the user to select from the following options:
            System.out.println(	"Press 1 to view books, " +
                                "\n2 to add books, "+
                                "\n3 to change the price of a book" +
                                "\n4 to compare the books, any other key to exit");
            String userAction = scanner.nextLine();
            if (userAction.equals("1")) {
                for(int i=0;i<books.length;i++) {
                    if(books[i] != null) {
                        System.out.println(books[i]);
                    }
                }
            } else if (userAction.equals("2")) {
                if(bkIdx == 10) {
                    System.out.println("10 books added already. Cannot add any more books!");
                    continue;
                }
                System.out.println("How do you want to create a book object? \nPress 1 for default constructor,"+ 
                                    "\n2 for creating a clone of an existing object " +
                                    "\nany other key for overloaded constructor");
                String constructor = scanner.nextLine();
                if (constructor.equals("1")) {
                    System.out.println("Enter book title");
                    String tmpTitle = scanner.nextLine();
                    System.out.println("Enter book author");
                    String tmpAuthor = scanner.nextLine();
                    System.out.println("Enter book price");
                    float tmpPrice = Float.parseFloat(scanner.nextLine());
                    Book bkTmp = new Book();
                    bkTmp.setTitle(tmpTitle);
                    bkTmp.setAuthor(tmpAuthor);
                    bkTmp.setPrice(tmpPrice);
                    books[bkIdx++] = bkTmp;
                } else if (constructor.equals("2")) {
                    System.out.println("Enter the index of book to clone");
                    int cloneIdx = Integer.parseInt(scanner.nextLine());
                    if (books[cloneIdx] != null) {
                        books[bkIdx++] = (Book)books[cloneIdx].clone();
                    }
                } else {
                    System.out.println("Enter book title");
                    String tmpTitle = scanner.nextLine();
                    System.out.println("Enter book author");
                    String tmpAuthor = scanner.nextLine();
                    System.out.println("Enter book price");
                    float tmpPrice = Float.parseFloat(scanner.nextLine());
                    books[bkIdx++] = new Book(tmpTitle, tmpAuthor, tmpPrice);
                }				
            } else if (userAction.equals("3")) {
                System.out.println("Enter index of book to change price");
                int book1Idx = Integer.parseInt(scanner.nextLine());
                if (books[book1Idx] != null) {
                    System.out.println("Enter the new price for the book");	
                    float newPrice = Float.parseFloat(scanner.nextLine());
                    books[book1Idx].setPrice(newPrice);					
                }
            } else if (userAction.equals("4")) {
                System.out.println("Enter index of first book to compare");
                int book1Idx = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter index of second book to compare");
                int book2Idx = Integer.parseInt(scanner.nextLine());
                if (books[book1Idx] != null && books[book2Idx] != null ) {
                    compareBooks(books[book1Idx],books[book2Idx]);
                } else {
                    System.out.println("One of the books is null");
                }
            } else {
                break;
            }
        }
    }
}