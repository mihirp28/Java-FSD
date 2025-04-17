package com.wp.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.springmvc.model.Book;
import com.wp.springmvc.repository.BookJpaRepository;
import com.wp.springmvc.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookJpaRepository repo;
	
	
	
	public Book saveBook(Book book){
		
		return repo.save(book);
	}

	public Book getBookByTitle(String title)  {
		return repo.findByTitle(title);
	}

	public List<Book> getAllBooks() {
		return repo.findAll();
	}

	public boolean deleteBook(long id)  {
		repo.deleteById(id);
		return !repo.existsById(id);
	}

	public Book updateBook(Book book)  {
		return repo.save(book);
	}

	
	@Override
	public Book getBookById(long id) {
		return repo.findById(id).get();
	}
	
	
}
