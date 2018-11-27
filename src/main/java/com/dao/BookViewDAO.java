package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.BookView;
import com.util.ConnectionFactory;

public class BookViewDAO {

	public List<BookView> getAvailableBooks(String cardno) {
		List<BookView> bookViewList = new ArrayList<BookView>();
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			bookViewList = session.selectList("com.mapper.LibraryMapper.getAvailableBooks", cardno);
		} finally {
			session.close();
		}
		return bookViewList;
	}
	
}
