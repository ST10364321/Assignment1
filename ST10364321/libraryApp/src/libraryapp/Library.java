/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 *
 * @author karan
 */
public class Library {
     private Book[] books;
    private int numberOfBooks;

    // Constructor
    public Library(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        System.out.println("List of Books in the Library:");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Year: " + books[i].getYear());
            System.out.println("---------------------------");
        }
    }

    // Method to search for a book by title
    public void searchBookByTitle(String searchTitle) {
        boolean found = false;
        System.out.println("Books with Title '" + searchTitle + "':");
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Year: " + books[i].getYear());
                System.out.println("---------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the given title.");
        }
    }
}

