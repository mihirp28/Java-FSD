package com.stackroute.oops.library.service;
import com.stackroute.oops.library.exception.BookNotFoundException;
import com.stackroute.oops.library.model.Book;
import com.stackroute.oops.library.model.BookGenre;

import java.util.Set;

/**
 * @Author Neha
 * @Date 08-Apr-22
 */

public interface BookGenreService {
    boolean addBookToGenre(Book book, String genreFileName, String bookFileName) throws BookNotFoundException;
    Set<BookGenre> getAllBookGenres (String fileName);
    Set<BookGenre> getBookSetByGenre(String genre, String fileName);
}
