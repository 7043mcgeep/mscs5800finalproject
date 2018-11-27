package com.service;

import java.util.List;

import com.dao.BookViewDAO;
import com.domain.BookView;

public class BookViewService {

	public List<BookView> getAvailableBooks(String cardno) {
		BookViewDAO bookViewDAO = new BookViewDAO();
		return bookViewDAO.getAvailableBooks(cardno);
	}
	
}
