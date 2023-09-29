/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryapp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karan
 */
public class LibraryApp {

   

    
public class LibraryApp {
    public void testLibraryFunctions() {
        // Test logic to validate library functions
        Library library = new Library(10);
        
        // Adding books
        Book book1 = new Book("Book1", "Author1", 2000);
        Book book2 = new Book("Book2", "Author2", 2010);
        library.addBook(book1);
        library.addBook(book2);

        // Displaying books
        library.displayBooks();

        // Searching for a book
        library.searchBookByTitle("Book1");

        // Invalid search
        library.searchBookByTitle("InvalidBook");

        // Adding more books to test the library capacity
        for (int i = 0; i < 10; i++) {
            library.addBook(new Book("Book" + (i + 3), "Author" + (i + 3), 2020 + i));
        }
        library.displayBooks(); // Should display only the first 10 books, the rest won't fit due to capacity
        
        // Attempting to add a book when the library is full
        library.addBook(new Book("BookOverflow", "AuthorOverflow", 2030));
    }

    public static void main(String[] args) {
        // Running the unit tests
        org.junit.runner.JUnitCore.main("LibraryApp");
    }
}

    
}
