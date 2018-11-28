package com.service;

import java.util.List;

import com.dao.BookViewDAO;
import com.dao.CheckedOutBooksDAO;
import com.domain.BookView;
import com.domain.CheckedOutBook;

public class BookViewService {

	public List<BookView> getAvailableBooks(String cardno) {
		BookViewDAO bookViewDAO = new BookViewDAO();
		return bookViewDAO.getAvailableBooks(cardno);
	}
	
}
