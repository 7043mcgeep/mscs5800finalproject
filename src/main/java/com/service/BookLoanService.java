package com.service;

import java.math.BigDecimal;

import com.dao.BookLoanDAO;
import com.domain.BookLoan;

public class BookLoanService {

	public void insertBookLoan(BookLoan bkLoan) {
		BookLoanDAO bookLoanDAO = new BookLoanDAO();
		bookLoanDAO.insertBookLoan(bkLoan);
	}
	
	public void deleteBookLoan(BigDecimal bookid, BigDecimal branchid, String cardno) {
		BookLoanDAO bookLoanDAO = new BookLoanDAO();
		BookLoan bkLoan = new BookLoan(bookid, branchid, cardno, null, null, null, null);
		bookLoanDAO.deleteBookLoan(bkLoan);
	}

}
