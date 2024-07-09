package com.stackroute.oops.library.service;

import com.stackroute.oops.library.exception.BookAlreadyExistsException;
import com.stackroute.oops.library.exception.BookNotFoundException;
import com.stackroute.oops.library.model.Book;

import java.util.List;

/**
 * @Author Neha
 * @Date 08-Apr-22
 */

public interface BookService {

    boolean addBook(Book book, String filename) throws BookAlreadyExistsException;

    List<Book> getAllBooks(String fileName);

    Book findBook(String bookId, String fileName) throws BookNotFoundException;
}
