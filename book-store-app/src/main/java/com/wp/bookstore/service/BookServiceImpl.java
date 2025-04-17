package com.wp.bookstore.service;

import java.sql.SQLException;
import java.util.List;

import com.wp.bookstore.model.Book;
import com.wp.bookstore.repository.BookRepository;
import com.wp.bookstore.repository.BookRepositoryImpl;
import com.wp.bookstore.repository.BookRepositoryJpaImpl;

public class BookServiceImpl implements BookService{

	private BookRepository repo;
	
	public BookServiceImpl() {
		repo = new BookRepositoryJpaImpl();
	}
	
	public Book saveBook(Book book) throws SQLException {
		
		return repo.saveBook(book);
	}

	public Book getBookByTitle(String title) throws SQLException {
		return repo.getBookByTitle(title);
	}

	public List<Book> getAllBooks() throws SQLException {
		return repo.getAllBooks();
	}

	public boolean deleteBook(long id) throws SQLException {
		return repo.deleteBook(id);
	}

	public Book updateBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return repo.updateBook(book);
	}

	
	@Override
	public Book getBookById(long id) throws SQLException {
		return repo.getBookById(id);
	}
	
	
}
