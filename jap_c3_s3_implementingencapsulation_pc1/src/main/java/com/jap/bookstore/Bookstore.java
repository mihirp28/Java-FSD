package com.jap.bookstore;

public class Bookstore {
    // Implement data hiding by declaring member variables private
    String bookStoreName;
    String bookStoreRegistrationId;
    Book[] books;

    //Declare getter and setter methods
    

    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage)
    {
        return -1;
    }

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public String getBookStoreRegistrationId() {
		return bookStoreRegistrationId;
	}

	public void setBookStoreRegistrationId(String bookStoreRegistrationId) {
		this.bookStoreRegistrationId = bookStoreRegistrationId;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
}
