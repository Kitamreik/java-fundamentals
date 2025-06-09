package com.example.library;

//When you need to use classes from other packages, you need to import them at the top of your source file. These examples illustrate two examples of importing classes.
import java.util.ArrayList; // Importing classes from Java's standard library
import java.util.List;

// Book class
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}