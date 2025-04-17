package com.wp.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.bookstore.model.Book;
import com.wp.bookstore.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService service;

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id") long id) {
		return service.getBookById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBookById(@PathVariable("id") long id) {
		service.deleteBook(id);
	}
	
	@PutMapping
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
}
