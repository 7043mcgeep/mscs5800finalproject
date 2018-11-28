package com.service;

import java.util.List;

import com.dao.BorrowerDAO;
import com.domain.Borrower;

public class BorrowerService {
	
	public Borrower getBorrowerWithCardNo(String cardno) {
		BorrowerDAO borrowerDAO = new BorrowerDAO();
		List<Borrower> temp = borrowerDAO.getBorrowerWithCardNo(cardno);
		if (temp.size() > 0) {
			return temp.get(0);
		} else {
			return null;
		}
	}

	public void insertBorrower(Borrower borr) {
		BorrowerDAO borrowerDAO = new BorrowerDAO();
		borrowerDAO.insertBorrower(borr);
	}

	public void deleteBorrowerWithCardNo(String cardno) {
		BorrowerDAO borrowerDAO = new BorrowerDAO();
		borrowerDAO.deleteBorrowerWithCardNo(cardno);
	}
	
	
}
