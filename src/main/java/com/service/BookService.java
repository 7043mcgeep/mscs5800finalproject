package com.service;

import java.math.BigDecimal;

import com.dao.BookDAO;
import com.domain.Book;

public class BookService {

	public Book getBookFromBookId(BigDecimal bookid) {
		BookDAO bookDAO = new BookDAO();
		return bookDAO.getBookFromBookId(bookid);
	}
	
}
