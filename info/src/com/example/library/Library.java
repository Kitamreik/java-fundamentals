package com.example.library;

//When you need to use classes from other packages, you need to import them at the top of your source file. These examples illustrate two examples of importing classes.
import java.util.ArrayList; // Importing classes from Java's standard library
import java.util.List;

// Library class
public class Library {
    private List<Book> books; // Private attribute to hold books

    public Library() {
        books = new ArrayList<>(); // Initialize the list in the constructor
    }

    public void addBook(Book book) {
        books.add(book); // Method to add a book to the library
    }

    public void displayBooks() {
        for (Book book : books) { //for each instance of the Book, iterate through each and show them
            book.display();
        }
    }
}

