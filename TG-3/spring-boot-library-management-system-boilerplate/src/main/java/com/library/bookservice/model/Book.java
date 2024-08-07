package com.library.bookservice.model;

import javax.persistence.*;
import java.time.LocalDate;


/*
Add appropriate annotation/s to map the class and its properties with a Database entity
    - bookId should be unique and generated by the Database
    - table name should be library_books
 */

@Entity
@Table(name="library_books")
public class Book {
	@Id
	@GeneratedValue
    private Integer bookId;
    private String authorId;
    private String libraryId;
    private LocalDate bookPublishedDate;
    private String status;
    private Integer bookQuantity;

    // Define a no argument constructor
    public Book(){

    }
    // Define a all argument constructor
    public Book(Integer bookId, String authorId, String libraryId, LocalDate bookPublishedDate, String status, Integer bookQuantity) {
        this.bookId = bookId;
        this.authorId = authorId;
        this.libraryId = libraryId;
        this.bookPublishedDate = bookPublishedDate;
        this.status = status;
        this.bookQuantity = bookQuantity;
    }

    // Define a Getter and Setter for all Book fields
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public LocalDate getBookPublishedDate() {
        return bookPublishedDate;
    }

    public void setBookPublishedDate(LocalDate bookPublishedDate) {
        this.bookPublishedDate = bookPublishedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Integer bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
