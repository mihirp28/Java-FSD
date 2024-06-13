package com.library.bookservice.service;

import com.library.bookservice.errorhandler.BookExistsException;
import com.library.bookservice.errorhandler.BookNotFoundException;
import com.library.bookservice.model.Book;
import com.library.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/*
Add appropriate annotation/s to create a bean for service layer
Implement all the functionality based on the BookService Interface
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository repo;

	@Override
	public Book addBook(Book newBook) throws BookExistsException {
		Optional<Book> optionalBook = repo.findBookByAuthorIdAndBookPublishedDate(newBook.getAuthorId(),
				newBook.getBookPublishedDate());
		if (optionalBook.isPresent()) {
			throw new BookExistsException();
		}
		return repo.save(newBook);
	}

	@Override
	public Book getBookById(Integer id) throws BookNotFoundException {
		Optional<Book> optionalBook = repo.findById(id);
		if (!optionalBook.isPresent()) {
			throw new BookNotFoundException();
		}
		return optionalBook.get();
	}

	@Override
	public List<Book> getBooksByAuthorId(String authorId) throws BookNotFoundException {
		List<Book> bookByAuthorId=repo.findBookByAuthorId(authorId);
        if(bookByAuthorId.isEmpty()){
            throw new BookNotFoundException();
        }
        return bookByAuthorId;
	}

	@Override
	public List<Book> getBooksByLibraryAndBookPublishedDate(String libraryId, LocalDate bookPublishedDate)
			throws BookNotFoundException {
		List<Book> bookByDate=repo.findBookByLibraryIdAndBookPublishedDate(libraryId,bookPublishedDate);
        if(bookByDate.isEmpty()){
            throw new BookNotFoundException();
        }
        return bookByDate;
	}

	@Override
	public Book updateBookStatus(int bookId, String status) throws BookNotFoundException {
		 Book book=getBookById(bookId);
	        book.setStatus(status);
	        return repo.save(book);
	}

	/*
	 * Inject the repository bean
	 */

}
