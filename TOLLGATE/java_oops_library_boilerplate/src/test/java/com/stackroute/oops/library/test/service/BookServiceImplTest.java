package com.stackroute.oops.library.test.service;

import com.stackroute.oops.library.exception.BookAlreadyExistsException;
import com.stackroute.oops.library.exception.BookNotFoundException;
import com.stackroute.oops.library.model.Book;
import com.stackroute.oops.library.service.BookService;
import com.stackroute.oops.library.service.BookServiceImpl;
import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookServiceImplTest {
    private static final String MESSAGE_ONE = "BallerServiceImpl should be initialized with an empty LinkedList properly";
    private static final String MESSAGE_TWO = "Given valid book data should add book to database and return true";
    private static final String MESSAGE_THREE = "Given invalid or empty book id should throw exception";
    private static final String MESSAGE_FOUR = "Given Valid bookId should return the book object";
    private static final String MESSAGE_FIVE = "Given empty book repo when searched should throw exception";
    private static final String MESSAGE_SIX = "getAllBooks should return book list";

    private static BookService bookService;
    private static Book book1;
    private static Book book2;

    private static final String BOOK_FILE_NAME = "src/test/resources/book.csv";
    private static final String GENRE_FILE_NAME = "src/test/resources/genre.csv";

    @BeforeAll
    public static void setUp() throws Exception {
        bookService = new BookServiceImpl();
        book1 = new Book("001", "Dracula", "Shradha", 200);
        book2 = new Book("002", "Life", "neha", 140);
    }

    @AfterAll
    public static void tearDown() {
        book1 = null;
        book2 = null;
        bookService = null;
    }

    @Test
    @Order(1)
    public void givenBookServiceObjectThenBookListSetAsArrayList() {
        assertThat(MESSAGE_ONE, bookService.getAllBooks(BOOK_FILE_NAME), is(empty()));
    }

    @Test
    @Order(2)
    public void givenBookDataWhenAddedThenReturnTrue() throws BookAlreadyExistsException {
        assertTrue(bookService.addBook(book1, BOOK_FILE_NAME), MESSAGE_TWO);
    }

    @Test
    @Order(3)
    public void givenBookDataWithAuthorLength() throws BookAlreadyExistsException {
        assertFalse(bookService.addBook(book2, BOOK_FILE_NAME), MESSAGE_TWO);
    }

    @Test
    @Order(4)
    public void givenBookDataAddedThenReturnAllBooks() {
        List<Book> expected = bookService.getAllBooks(BOOK_FILE_NAME);
        System.out.println(expected.get(0));
        assertEquals(book1.getBookId(), expected.get(0).getBookId(), MESSAGE_SIX);
    }

    @Test
    @Order(5)
    public void givenValidBookIdThenReturnBook() throws BookNotFoundException {
        Book expected = bookService.findBook("001", BOOK_FILE_NAME);
        assertEquals(book1.getBookId(), expected.getBookId(), MESSAGE_FOUR);
    }

    @Test
    @Order(6)
    public void givenBookDetailsWhenUpdatedThenReturnTrue() {
        book1.setGenre("HORROR");
    }

    @Test
    @Order(7)
    public void givenNonExistingOrEmptyBookIdThenThrowException() {
        assertThrows(BookNotFoundException.class, () -> bookService.findBook("002", BOOK_FILE_NAME), MESSAGE_THREE);
        assertThrows(BookNotFoundException.class, () -> bookService.findBook("", BOOK_FILE_NAME), MESSAGE_THREE);

    }


    @Test
    @Order(8)
    public void givenInValidBookIdThenReturnNull() {
        assertThrows(BookNotFoundException.class, () -> bookService.findBook("", BOOK_FILE_NAME), MESSAGE_THREE);
        assertThrows(BookNotFoundException.class, () -> bookService.findBook("  ", BOOK_FILE_NAME), MESSAGE_THREE);
        assertThrows(BookNotFoundException.class, () -> bookService.findBook(null, BOOK_FILE_NAME), MESSAGE_THREE);
    }

    @Test
    @Order(9)
    public void givenBookDataDeletedWhenSearchedThenThrowException() throws FileNotFoundException {
        new PrintWriter(BOOK_FILE_NAME).close();
        assertThrows(BookNotFoundException.class, () -> bookService.findBook("001", BOOK_FILE_NAME), MESSAGE_FIVE);
    }
}
