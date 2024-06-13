package com.stackroute.oops.library.service;



/**
 * @Author Neha
 * @Date 08-Apr-22
 */

import com.stackroute.oops.library.exception.BookAlreadyExistsException;
import com.stackroute.oops.library.exception.BookNotFoundException;
import com.stackroute.oops.library.model.Book;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is implementing the BookService interface
 * This class has one field bookList to store list of books
 */

public class BookServiceImpl implements BookService{
    /**
     * Constructor to initialize an empty ArrayList for bookList
     */
	 LinkedList<Book> bookList;

	    public BookServiceImpl() {
	        bookList = new LinkedList<>();
	    }


    /**
     * addBook has to return true if book object is stored in "books.csv" as comma separated fields successfully
     * proceed to store book details in books.csv only when bookAuthor length is greater than six and bookValue is greater than 100
     * addBook has to return false if any of above condition doesn't match
     * throw BookAlreadyExistsException if baller with same bookId already exist
     */

    @Override
    public boolean addBook(Book book, String fileName) throws BookAlreadyExistsException{
    	FileOutputStream file;
        ObjectOutputStream obj;

        if ((book == null || book.getBookAuthor().length() < 6 || book.getBookValue() <= 100)) {
            return false;
        }

        if (bookList.contains(book)) {
            throw new BookAlreadyExistsException();
        }

        try {
            file = new FileOutputStream(fileName);
            obj = new ObjectOutputStream(file);

            obj.writeObject(book);
            bookList.add(book);

            obj.close();
            file.close();

            return true;

        } catch (IOException e) {
        }

        return false;
    }

    /**
     * Return Book object given bookId to search
     * Throw BookNotFoundException if book with bookId doesn't match with any book
     */

    @Override
    public Book findBook(String bookId, String fileName) throws BookNotFoundException {
    	 if (bookId == null || bookId.trim().isEmpty()) {
             throw new BookNotFoundException();
         }

         List<Book> allBooks = getAllBooks(fileName);
         for (Book book : allBooks) {
             if (book.getBookId().equals(bookId)) {
                 //System.out.println(player);
                 return book;
             }
         }
         throw new BookNotFoundException();
     }
    

    /**
    Return the list of book objects by reading data from the file "book.csv"
     */

    @Override
    public List<Book> getAllBooks(String fileName) {
    	 List<Book> books = new ArrayList<>();
         try {
             FileInputStream filein = new FileInputStream(fileName);
             ObjectInputStream objin = new ObjectInputStream(filein);

             Book book;

             do {
                 book = (Book) objin.readObject();
                 if (book != null) {
                     books.add(book);
                 }
             } while (book != null);
             objin.close();
             filein.close();
         } catch (Exception e) {
             // catch any type of exception and print the same
         }

         return books;
    }


}
