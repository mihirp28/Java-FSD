package com.wp.springbootmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.service.BookService;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@Setter
@Getter
public class BookRestController {
	
	@Autowired
	private BookService service;
	
	
	

	@PostMapping(consumes = {"application/json","application/xml"}, 
					produces = {"application/xml","application/json"})
	//@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		log.info("POST Request");
		log.info("Body : "+book);
		Book savedBook =  service.saveBook(book);
		log.info("Item Saved : "+savedBook);
		// return ResponseEntity.accepted().body(savedBook);
		// return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
		return new ResponseEntity<>(savedBook,HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}
	
	
	@GetMapping(path = "/id/{id}", produces = {"application/xml","application/json"})
	public Book getBook(@PathVariable long id) {
		return service.getBook(id);
	}
	
	@DeleteMapping("/id/{id}")
	public void deleteBook(@PathVariable long id) {
		 service.deleteBook(id);
	}
	
	@GetMapping("/title/{title}")
	public Book getBookByTitle(@PathVariable String title) {
		return service.getBookByTitle(title);
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
}
