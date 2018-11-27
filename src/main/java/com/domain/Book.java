package com.domain;

import java.math.BigDecimal;

public class Book {

	private BigDecimal bookid;
	private String title;
	private String publishername;
	
	public Book(BigDecimal bookid, String title, String publishername) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.publishername = publishername;
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

	public String getPublishername() {
		return publishername;
	}

	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", publishername=" + publishername + "]";
	}
	
}
