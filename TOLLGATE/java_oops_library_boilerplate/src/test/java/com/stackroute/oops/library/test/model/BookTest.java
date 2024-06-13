package com.stackroute.oops.library.test.model;

import com.stackroute.oops.library.model.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Neha
 * @Date 08-Apr-22
 */

public class BookTest {
    private static final String MESSAGE_ONE = "Book object should be initialized with properties";
    private static final String MESSAGE_TWO = "Book details should be properly displayed";
    private static final String MESSAGE_THREE = "Book Genre should not be null or empty. Give proper value to set";
    private Book book;

    @BeforeEach
    public void setUp() {
        book = new Book("001", "Treasure Island", "Nehaaa", 200);
    }

    @AfterEach
    public void tearDown() {
        book = null;
    }

    @Test
    public void givenBookObjectThenShouldSetProperties() {
        assertEquals("001", book.getBookId(), MESSAGE_ONE);
        assertEquals("Treasure Island", book.getBookName(), MESSAGE_ONE);
        assertEquals("Nehaaa", book.getBookAuthor(), MESSAGE_ONE);
        assertEquals(200, book.getBookValue(), MESSAGE_ONE);
    }

    @Test
    public void givenBookObjectThenReturnBookDetails() {
        String expected = "Book{book id=001, book name=Treasure Island, book Author=Nehaaa, book value=200}";
        assertEquals(book.toString().toLowerCase(), expected.toLowerCase(), MESSAGE_TWO);
        book.setGenre("ADVENTURE");

        expected = "Book{book id=001, book name=Treasure Island, book Author=Nehaaa, book value=200,book genre=ADVENTURE}";
        assertEquals(book.toString().toLowerCase(), expected.toLowerCase(), MESSAGE_TWO);
    }

    @Test
    public void givenBookObjectWhenGenreSetThenAddNewGenreProperty() {
        book.setGenre("ADVENTURE");
        assertEquals("ADVENTURE",book.getGenre(),  MESSAGE_THREE);
        book.setGenre("");
        assertEquals("",book.getGenre(),  MESSAGE_THREE);
        book.setGenre(null);
        assertEquals(null,book.getGenre(), MESSAGE_THREE);
    }
}
