package com.stackroute.oops.library.model;
import java.io.Serializable;
/**
 * @Author Neha
 * @Date 08-Apr-22
 */

/**
 * This class contains five fields bookId, bookName, bookAuthor, bookValue and genre
 * It is a subclass of Comparable interface
 */

public class Book implements Serializable,Comparable<Book> {

	 	private String bookId;
	    private String bookName;
	    private String bookAuthor;
	    private int bookValue;
	    private String genre;
	    
    //Parameterized Constructor to initialize bookId, bookName, bookAuthor, bookValue properties
	    public Book(String bookId, String bookName, String bookAuthor, int bookValue) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.bookAuthor = bookAuthor;
	        this.bookValue = bookValue;
	    }
    /*
    Getter for all bookId, bookName, bookAuthor, bookValue and genre
     */
	    public String getBookId() {
			return bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public String getBookAuthor() {
			return bookAuthor;
		}

		public int getBookValue() {
			return bookValue;
		}

		public String getGenre() {
			return genre;
		}

		
    /*
    Setter for genre property
     */
		public void setGenre(String genre) {
			this.genre = genre;
		}

    /**
     * This overridden method should return book details in below format
     * Book{bookId=xxxxx, bookName=xxxxxx, bookAuthor=xxxxxx,book value=xxxxxxxx, genre=xxxxx}-> if genre is set
     * Book{bookId=xxxxx, bookName=xxxxxx, bookAuthor=xxxxxx,book value=xxxxxxxx}-> if genre is not set
     */

    @Override
    public String toString() {
    	if(genre==null || genre.isEmpty() || genre.trim().isEmpty()) 
			return "Book{book Id="+bookId+", book Name="+bookName+", book Author="+bookAuthor+", book Value="+bookValue+"}";
		else 
			return "Book{book Id="+bookId+", book Name="+bookName+", book Author="+bookAuthor+", book Value="+bookValue+",book genre="+genre+"}";
    }

    
	//compareTo book object based on bookId
    public int compareTo(Book o) {
    	return bookId.compareTo(o.bookId);
    }


}
