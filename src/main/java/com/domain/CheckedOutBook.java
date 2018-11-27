package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CheckedOutBook {

	private BigDecimal bookid;
	private String title;
	private Date dateout;
	private Date duedate;
	
	public CheckedOutBook() {
		super();
	}

	public CheckedOutBook(BigDecimal bookid, String title, Date dateout, Date duedate) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.dateout = dateout;
		this.duedate = duedate;
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

	public Date getDateout() {
		return dateout;
	}

	public void setDateout(Date dateout) {
		this.dateout = dateout;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	@Override
	public String toString() {
		return "CheckedOutBook [bookid=" + bookid + ", title=" + title + ", dateout=" + dateout + ", duedate=" + duedate
				+ "]";
	}
	
}
