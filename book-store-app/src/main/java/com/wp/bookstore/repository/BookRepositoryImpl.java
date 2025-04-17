package com.wp.bookstore.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wp.bookstore.model.Book;

public class BookRepositoryImpl implements BookRepository{
	
	Connection conn;
	PreparedStatement stmt;
	String url="jdbc:mysql://localhost:3306/wp_batch27";
	String username="root";
	String password="password";
	
	
	public BookRepositoryImpl() {
		try {
		conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Successful");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Book saveBook(Book book) throws SQLException {
		
		stmt = conn.prepareStatement("insert into book_db values(?,?,?,?)");
		
		stmt.setString(1,book.getTitle());
		stmt.setString(2, book.getAuthor());
		stmt.setFloat(3, book.getPrice());
		
		String dateString = book.getDatePublished()
									.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		stmt.setString(4, dateString);
		
		int rowCount = stmt.executeUpdate();
		
		if(rowCount>0) {
			return book;
		}
		
		return null;
	}

	public Book getBookByTitle(String title) throws SQLException {
		
		stmt = conn.prepareStatement("select * from book_db where title=?");
		stmt.setString(1, title);
		ResultSet queryResult = stmt.executeQuery();
		Book book = null;
		if(queryResult.next()) {
			
			String bookTitle = queryResult.getString("title");
			String author = queryResult.getString("author");
			float price = queryResult.getFloat("price");
			String dateString = queryResult.getString("datePublished");
			LocalDate datePublished = LocalDate.parse(dateString);
			
			book = new Book(bookTitle, author, price, datePublished);
			
		}
		
		return book;
	}

	public List<Book> getAllBooks()throws SQLException {
		
		stmt = conn.prepareStatement("select * from book_db");
		ResultSet queryResult = stmt.executeQuery();
		Book book = null;
		List<Book> books = new ArrayList<Book>();
		while(queryResult.next()) {
			
			String bookTitle = queryResult.getString("title");
			String author = queryResult.getString("author");
			float price = queryResult.getFloat("price");
			String dateString = queryResult.getString("datePublished");
			LocalDate datePublished = LocalDate.parse(dateString);
			
			book = new Book(bookTitle, author, price, datePublished);
			
			books.add(book);
			
		}
		return books;
	}

	public boolean deleteBook(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
