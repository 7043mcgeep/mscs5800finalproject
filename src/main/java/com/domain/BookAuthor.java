package com.domain;

import java.math.BigDecimal;

public class BookAuthor {

	private BigDecimal bookid;
	private String authorname;
	
	public BookAuthor(BigDecimal bookid, String authorname) {
		super();
		this.bookid = bookid;
		this.authorname = authorname;
	}

	public BigDecimal getBookid() {
		return bookid;
	}

	public void setBookid(BigDecimal bookid) {
		this.bookid = bookid;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "BookAuthor [bookid=" + bookid + ", authorname=" + authorname + "]";
	}
	
}
