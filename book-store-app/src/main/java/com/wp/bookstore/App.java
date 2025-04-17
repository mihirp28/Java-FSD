package com.wp.bookstore;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.wp.bookstore.model.Book;
import com.wp.bookstore.repository.BookRepository;
import com.wp.bookstore.repository.BookRepositoryImpl;
import com.wp.bookstore.service.BookService;
import com.wp.bookstore.service.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BookService service = new BookServiceImpl();

		// Inserting a new Book
		
		Book book = new Book("Data Structure in Java", "Mahesh Reddy", 789.0F, LocalDate.of(2018, 10, 25));
//
		try {
			service.saveBook(book);
			System.out.println("Book Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Getting a Book by title
		
//		try {
//			Book book = service.getBookByTitle("Java Programming");
//			System.out.println(book);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Fetching all the records
		
//		try {
//			List<Book> allBooks = service.getAllBooks();
//			allBooks.forEach(book->System.out.println(book));
//		}
//		catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
		
		
	}
}
