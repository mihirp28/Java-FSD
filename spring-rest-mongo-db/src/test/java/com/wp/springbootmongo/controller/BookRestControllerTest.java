package com.wp.springbootmongo.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.service.BookService;



@ExtendWith(SpringExtension.class)
@WebMvcTest(value = BookRestController.class)
class BookRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	BookService service;
	
//	Book book = new Book(10001,"Programming Essentials", "Javed", LocalDate.parse("2020-10-10"), 400);
//
//	@Test
//	void testAddBook() throws Exception {
//		
//		when(service.saveBook(book)).thenReturn(book);
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/books")
//				.contentType("application/json")
//				.content("{\"title\":\"Programming Essentials\",\"author\":\"Javed\",\"datePublished\":\"2020-10-10\",\"price\":400.0,\"id\":10001}");
//		
//		mockMvc.perform(requestBuilder)
//					.andExpect(status().isCreated())
//					.andReturn();
//	}
////
////	@Test
////	void testGetAllBooks() {
////		fail("Not yet implemented");
////	}
//	
//	
//
//	@Test
//	void testGetBook() throws Exception {
//		 when(service.getBook(10001)).thenReturn(book);
//		
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/books/id/10001");
//		
//		mockMvc.perform(requestBuilder)
//				.andExpect(status().isOk())
//				//.andExpect(content().json("{\"title\":\"Programming Essentials\",\"author\":\"Javed\",\"datePublished\":\"2020-10-10\",\"price\":400.0,\"id\":10001}"))
//				.andReturn();
//	}
//	
//	
//	
//
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
