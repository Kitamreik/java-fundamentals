package com.example.library;

//When you need to use classes from other packages, you need to import them at the top of your source file. These examples illustrate two examples of importing classes.
import java.util.ArrayList; // Importing classes from Java's standard library
import java.util.List;

// Main class with entry point
public class Main {
    public static void main(String[] args) {
        Library library = new Library(); // Create an instance of Library

        // Add books to the library
        library.addBook(new Book("Coding In Java", "Kit F. Amreik"));
        library.addBook(new Book("The Back End Beast", "Kit F. Amreik"));

        library.displayBooks();  // Display all books
    }
}
