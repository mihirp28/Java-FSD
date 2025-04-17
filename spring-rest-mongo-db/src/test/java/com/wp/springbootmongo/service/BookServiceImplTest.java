package com.wp.springbootmongo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import javax.print.DocFlavor.SERVICE_FORMATTED;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.repository.BookRepository;
@ExtendWith(SpringExtension.class)
class BookServiceImplTest {

	@Mock
	BookRepository repo;
	
	@InjectMocks
	BookServiceImpl service;
	
//	Book book = new Book(10001,"Programming Essentials", "Javed", LocalDate.parse("2020-10-10"), 400);
//	
//	@Test
//	void testSaveBook() {
//		
//		when(repo.save(book)).thenReturn(book);
//		
//		assertEquals(book, service.saveBook(book));
//		
//	}
//
//	@Test
//	void testGetBook() {
//		when(repo.findById(book.get_id())).thenReturn(Optional.of(book));
//		assertNotNull(service.getBook(10001));
//		
//	}
//
////	@Test
////	void testGetAllBooks() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testDeleteBook() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testGetBookByTitle() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testUpdateBook() {
////		fail("Not yet implemented");
////	}

}
