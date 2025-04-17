package com.wp.bookstore.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.wp.bookstore.model.Book;

public class BookRepositoryJpaImpl implements BookRepository{

	EntityManagerFactory emfactory;  // SesstionFactory
	EntityManager emgr;				 // Session
	EntityTransaction tx;			 // Transaction
	
	public BookRepositoryJpaImpl() {
		emfactory = Persistence.createEntityManagerFactory("book-persistence");
		// hibernate.cfg.xml
		emgr = emfactory.createEntityManager();
		tx=emgr.getTransaction();
	}
	
	@Override
	public Book saveBook(Book book) throws SQLException {
		tx.begin();
		Book insertedBook = emgr.merge(book);
		tx.commit();
		return insertedBook;
	}
	
	@Override
	public Book getBookById(long id) {
		
		return emgr.find(Book.class, id);
	}

	@Override
	public Book getBookByTitle(String title) throws SQLException {
		TypedQuery<Book> query = emgr.createQuery("from Book where title=:title",Book.class);
		query.setParameter("title", title);
		return  query.getSingleResult();
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
		
		TypedQuery<Book> query = emgr.createQuery("from Book",Book.class);
		return query.getResultList();
		
	}

	@Override
	public boolean deleteBook(long id) throws SQLException {
		Book book = emgr.find(Book.class, id);
		if(book!=null) {
			tx.begin();
			emgr.remove(book);
			tx.commit();
			return true;
		}
		return false;
	}

	@Override
	public Book updateBook(Book book) throws SQLException {
		tx.begin();
		Book updatedBook = emgr.merge(book);
		tx.commit();
		return updatedBook;
	}

}
