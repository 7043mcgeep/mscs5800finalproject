package com.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.Book;
import com.util.ConnectionFactory;

public class BookDAO {

	public Book getBookFromBookId(BigDecimal bookid) {
		List<Book> bookList = new ArrayList<Book>();
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			bookList = session.selectList("com.mapper.LibraryMapper.getBookFromBookId", bookid );
		} finally {
			session.close();
		}
		return bookList.get(0);
	}

}
