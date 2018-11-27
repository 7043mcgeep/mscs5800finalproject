package com.domain;

import java.math.BigDecimal;

public class BookView {

	private BigDecimal bookid;
	private String title;
	private BigDecimal branchid;
	private String branchname;
	
	public BookView(BigDecimal bookid, String title, BigDecimal branchid, String branchname) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.branchid = branchid;
		this.branchname = branchname;
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

	public BigDecimal getBranchid() {
		return branchid;
	}

	public void setBranchid(BigDecimal branchid) {
		this.branchid = branchid;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	@Override
	public String toString() {
		return "BookView [bookid=" + bookid + ", title=" + title + ", branchid=" + branchid + ", branchname="
				+ branchname + "]";
	}
	
}
