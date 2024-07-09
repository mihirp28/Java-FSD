package com.stackroute.wipro.ThePublishingFirm_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private String name;
	private int ISBN;
	@Autowired
	private Author author;
	public Book() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", ISBN=" + ISBN + ", author=" + author + "]";
	}


}
