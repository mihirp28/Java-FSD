package com.wp.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.wp.springmvc.model.Book;



public interface BookService {

	public Book saveBook(Book book) ;
	
	public Book getBookByTitle(String title);
	
	public List<Book> getAllBooks();
	
	public boolean deleteBook(long id);
	public Book getBookById(long id);
	
	public Book updateBook(Book book);
	
	
}
