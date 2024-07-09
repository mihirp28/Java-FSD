package com.stackroute.oops.library.model;
/**
 * @Author Neha
 * @Date 08-Apr-22
 */
import java.io.Serializable;

/**
 * This class contains five fields bookId, genre
 * It is a subclass of Comparable interface
 */

public class BookGenre implements Serializable,Comparable<BookGenre> {

	 private String bookId;
	 private String genre;

    //Parameterized Constructor to initialize all properties
	 public BookGenre(String bookId, String genre) {
			super();
			this.bookId = bookId;
			this.genre = genre;
		}
    /*
    Getter and setter for all properties
     */
		public String getBookId() {
			return bookId;
		}

		public void setBookId(String bookId) {
			this.bookId = bookId;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}
    /**
     * This overridden method should return book details in below format
     * Book{bookId=xxxxx, genre=xxxxxx}
     */

    @Override
    public String toString() {
        return "Book{bookId="+bookId+", genre="+genre+"}";
    }

   
	//Overridden compareTo method based on bookId
    public int compareTo(BookGenre o) {
        return bookId.compareTo(o.bookId);
    }
}
