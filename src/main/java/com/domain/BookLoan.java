package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BookLoan {

	private BigDecimal bookid;
	private BigDecimal branchid;
	private String cardno;
	private Date dateout;
	private Date duedate;
	private Date datein;
	private BigDecimal rating;
	public BookLoan(BigDecimal bookid, BigDecimal branchid, String cardno, Date dateout, Date duedate, Date datein,
			BigDecimal rating) {
		super();
		this.bookid = bookid;
		this.branchid = branchid;
		this.cardno = cardno;
		this.dateout = dateout;
		this.duedate = duedate;
		this.datein = datein;
		this.rating = rating;
	}
	public BookLoan() {
		// TODO Auto-generated constructor stub
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
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
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
	public Date getDatein() {
		return datein;
	}
	public void setDatein(Date datein) {
		this.datein = datein;
	}
	public BigDecimal getRating() {
		return rating;
	}
	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "BookLoan [bookid=" + bookid + ", branchid=" + branchid + ", cardno=" + cardno + ", dateout=" + dateout
				+ ", duedate=" + duedate + ", datein=" + datein + ", rating=" + rating + "]";
	}
	
}
