package com.wipro.stackroute.ThePublishingFirm;

public class Book {
	private String bookName;
	private int ISBNno;
	private Author author;
	public Book() {
	}
	


	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getISBNno() {
		return ISBNno;
	}
	public void setISBNno(int iSBNno) {
		ISBNno = iSBNno;
	}
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", ISBNno=" + ISBNno + ", author=" + author + "]";
	}

}
