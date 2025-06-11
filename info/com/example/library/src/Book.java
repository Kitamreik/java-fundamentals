package com.example.library;

//When you need to use classes from other packages, you need to import them at the top of your source file. These examples illustrate two examples of importing classes.
import java.util.ArrayList; // Importing classes from Java's standard library
import java.util.List;

//Book class- enhanced version - see constructor lab
//Implement Cloneable interface to allow cloning: An Object of a class is not by default cloneable. To create a clone of the object, you will need to create an object and explicitly use setters and getters. This technique is not ideal, espcially when the class has too many attributes. Java provides the Cloneable interface for this purpose.
public class Book implements Cloneable {
    private String title;
    private String author;
    private float price;

     //When you create an overloaded constructor, another constructor with the same name (using the class name) but different sets of parameters, you need to also create a default constructor.
    public Book() { // This is the default constructor, which will create an instance but the values will have to be explicitly set with the setters.
        // this.title = null;
        // this.author = null;
    }

    public Book(String title, String author, float price) { //This is the constructor of the class which takes three parameters for each of the attribute. The value of each of the attribute is set with the parameter passed.
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overriding the clone() method - This method class the super class clone method which would internally clone all the attributes of the object into a new object.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
            + this.author + "\nPrice - "+ String.format("%.2f", this.price);
    }
    //-------
    public boolean equals(Book book2) {
        if (this.title.equals(book2.getTitle()) &&
            this.author.equals(book2.getAuthor()) &&
            this.price == book2.getPrice()) {
                return true;
            } else {
                return false;
            }
    }
   
}

// Book class - simple version
/*
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
*/
