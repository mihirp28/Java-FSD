package com.stackroute.oops.library.service;


/**
 * @Author Neha
 * @Date 08-Apr-22
 */

import com.stackroute.oops.library.exception.BookNotFoundException;
import com.stackroute.oops.library.model.Book;
import com.stackroute.oops.library.model.BookGenre;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class implements the BookGenreService interface
 * This class has three private fields bookGenreSet, bookService
 */
public class BookGenreServiceImpl implements BookGenreService{
    /**
     *Constructor to initialize an empty TreeSet and BookService object
     */
	TreeSet<BookGenre> bookGenreSet;
    BookServiceImpl bookService;
    
    public BookGenreServiceImpl() {
    	bookGenreSet = new TreeSet<>();
    	bookService = new BookServiceImpl();
    }
    /*Add given book to bookGenre.csv file
     * return true if bookId and genre is stored in "genre.csv" as comma separated fields successfully
     * return false if provided 'book.genre' is equal to null
     * check if provided book already exist in "book.csv" file by making a call to 'bookService.findBook(bookId)'
     * throw bookNotFoundException if bookService.findBook(bookId) returns null  */

    @Override
    public boolean addBookToGenre(Book book, String genreFileName, String bookFileName) throws BookNotFoundException  {
    	 if (book.getGenre() == null) {
             return false;
         }
    	 
    	 bookService.findBook(book.getBookId(), bookFileName);
    	 
    	 FileOutputStream file;
         ObjectOutputStream obj;

         try {
             file = new FileOutputStream(genreFileName);
             obj = new ObjectOutputStream(file);

             BookGenre bookGenre = new BookGenre(book.getBookId(), book.getGenre());

             obj.writeObject(bookGenre);
             bookGenreSet.add(bookGenre);

             obj.close();
             file.close();

             return true;

         } catch (IOException e) {
         }
    	 
        return false;
    }

    //Return the set of all BookGenre by reading the file content from "genre.csv" file

    @Override
    public Set<BookGenre> getAllBookGenres(String fileName) {
    	 Set<BookGenre> bookGenres = new HashSet<>();
         try {
             FileInputStream filein = new FileInputStream(fileName);
             ObjectInputStream objin = new ObjectInputStream(filein);

             BookGenre book;

             do {
                 book = (BookGenre) objin.readObject();
                 if (book != null) {
                     bookGenres.add(book);
                 }
             } while (book != null);
             objin.close();
             filein.close();
         } catch (Exception e) {
             // catch any type of exception and print the same
         }

         /* Catch any type of exception caused and print the exception message*/
         return bookGenres;
    }


     /*
   Returns the set of bookGenre belonging to a particular genre
   one can get to know about bookGenre and their corresponding genre by "genre.csv" file
    */

    @Override
    public Set<BookGenre> getBookSetByGenre(String genre, String fileName) {
    	 Set<BookGenre> books = new HashSet<>();

         for (BookGenre book : getAllBookGenres(fileName)) {
             if(book.getGenre().equals(genre))
             {
                 books.add(book);
             }
         }
         return books;
    }
}
