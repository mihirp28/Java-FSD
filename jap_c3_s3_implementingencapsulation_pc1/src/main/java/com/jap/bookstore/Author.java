package com.jap.bookstore;
public class Author {
    // Implement data hiding by declaring member variables private

    private String authorName;
    private String authorPenName;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorPenName() {
		return authorPenName;
	}
	public void setAuthorPenName(String authorPenName) {
		this.authorPenName = authorPenName;
	}

 


}
