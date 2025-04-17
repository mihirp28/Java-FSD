package com.wp.bookstore.service;

import java.util.List;

import com.wp.bookstore.model.Book;

public interface BookService {

	public Book addBook(Book book);
	
	public Book getBookById(long id);
	
	public Book updateBook(Book book);
	
	public List<Book> getAllBooks();
	
	public void deleteBook(long id);
	
}
