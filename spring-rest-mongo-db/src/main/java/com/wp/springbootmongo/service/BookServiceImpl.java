package com.wp.springbootmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.springbootmongo.exception.DuplicateItemException;
import com.wp.springbootmongo.exception.ItemNotFoundException;
import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repo;

	@Override
	public Book saveBook(Book book) {
		
		if(repo.existsById(book.get_id())) {
			throw new DuplicateItemException("Item with ID "+book.get_id()+" Already Exists");
		}
		
		return repo.save(book);
	}

	@Override
	public Book getBook(long id) {
		
//		if(!repo.existsById(id)) {
//			throw new ItemNotFoundException("Item with ID "+id+" Not Found");
//		}
		
		return repo.findById(id).orElseThrow(
							()-> new ItemNotFoundException("Item with ID "+id+" Not Found")
						);
	}

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();
	}

	@Override
	public void deleteBook(long id) {
		repo.deleteById(id);
		
	}
	
	@Override
	public Book getBookByTitle(String title) {
		return repo.findByTitle(title);
	}
	
	public Book updateBook(Book book) {
		return repo.save(book);
	}
	

}
