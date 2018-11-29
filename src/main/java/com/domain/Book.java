package com.domain;

import java.math.BigDecimal;

public class Book {

	private BigDecimal bookid;
	private String title;
	private String publisher;
	
	public Book(BigDecimal bookid, String title, String publishername) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.publisher = publishername;
	}

	public BigDecimal getBookid() {
		return bookid;
	}

	public void setBookid(BigDecimal bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publishername) {
		this.publisher = publishername;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", publishername=" + publisher + "]";
	}
	
}
