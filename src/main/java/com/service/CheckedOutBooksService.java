package com.service;

import java.util.List;

import com.dao.CheckedOutBooksDAO;
import com.domain.CheckedOutBook;

public class CheckedOutBooksService {

	public List<CheckedOutBook> getCheckedOutBooks(String cardno) {
		CheckedOutBooksDAO checkedOutBooksDAO = new CheckedOutBooksDAO();
		return checkedOutBooksDAO.getCheckedOutBooks(cardno);
	}
	
}
