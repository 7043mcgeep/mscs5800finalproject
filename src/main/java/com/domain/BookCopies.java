package com.domain;

import java.math.BigDecimal;

public class BookCopies {

	private BigDecimal bookid;
	private BigDecimal branchid;
	private BigDecimal no_of_copies;
	
	public BookCopies(BigDecimal bookid, BigDecimal branchid, BigDecimal no_of_copies) {
		super();
		this.bookid = bookid;
		this.branchid = branchid;
		this.no_of_copies = no_of_copies;
	}

	public BigDecimal getBookid() {
		return bookid;
	}

	public void setBookid(BigDecimal bookid) {
		this.bookid = bookid;
	}

	public BigDecimal getBranchid() {
		return branchid;
	}

	public void setBranchid(BigDecimal branchid) {
		this.branchid = branchid;
	}

	public BigDecimal getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(BigDecimal no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	@Override
	public String toString() {
		return "BookCopies [bookid=" + bookid + ", branchid=" + branchid + ", no_of_copies=" + no_of_copies + "]";
	}
	
}
