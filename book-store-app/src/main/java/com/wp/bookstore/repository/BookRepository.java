package com.wp.bookstore.repository;

import java.sql.SQLException;
import java.util.List;

import com.wp.bookstore.model.Book;

public interface BookRepository {

	public Book saveBook(Book book) throws SQLException;
	
	public Book getBookByTitle(String title)throws SQLException;
	
	public List<Book> getAllBooks()throws SQLException;
	
	public boolean deleteBook(long id)throws SQLException;
	
	public Book updateBook(Book book)throws SQLException;
	
	public Book getBookById(long id);
	
}
