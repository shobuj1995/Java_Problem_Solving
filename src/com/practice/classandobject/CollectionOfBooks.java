package com.practice.classandobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class CollectionOfBooks {
    private String bookName;
    private String bookAuthor;
    private String bookIsbn;
     private static ArrayList<CollectionOfBooks>  bookCollection =new ArrayList<CollectionOfBooks>();
    public CollectionOfBooks(String bookName, String bookAuthor, String bookIsbn) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public static ArrayList<CollectionOfBooks> getBookCollection() {
        return bookCollection;
    }

    public static void setBookCollection(ArrayList<CollectionOfBooks> bookCollection) {
        CollectionOfBooks.bookCollection = bookCollection;
    }
    public static void addBook(CollectionOfBooks book){
        bookCollection.add(book);
    }
    public static void removeBook(CollectionOfBooks book){
        bookCollection.remove(book);
    }

    public static void main(String[] args) {
        CollectionOfBooks book1 = new CollectionOfBooks("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        CollectionOfBooks book2 = new CollectionOfBooks("An Introduction to Python", "Guido van Rossum", "9355423489");
        CollectionOfBooks.addBook(book1);
        CollectionOfBooks.addBook(book2);
        ArrayList<CollectionOfBooks> collectionOfBooks= CollectionOfBooks.getBookCollection();
        System.out.println("List of books: "+collectionOfBooks);
        for (CollectionOfBooks book:collectionOfBooks){
            System.out.println(book.getBookName()+" by "+book.getBookAuthor());
        }
        System.out.println(collectionOfBooks);
        CollectionOfBooks.removeBook(book1);
        System.out.println(collectionOfBooks);
        System.out.println("\nAfter removing " + book1.getBookName() + ":");
        System.out.println("List of books");
        for(CollectionOfBooks book: collectionOfBooks){
            System.out.println(book.getBookName()+ " by " + book.getBookAuthor() + ", ISBN: " + book.getBookIsbn());
        }
    }
}
