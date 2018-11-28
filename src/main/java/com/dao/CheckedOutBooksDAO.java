package com.dao;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.domain.CheckedOutBook;
import com.util.ConnectionFactory;

public class CheckedOutBooksDAO {

	public List<CheckedOutBook> getCheckedOutBooks(String cardno) {
		List<CheckedOutBook> checkedOutBookList = new ArrayList<CheckedOutBook>();
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			checkedOutBookList = session.selectList("com.mapper.LibraryMapper.getCheckedOutBooks", cardno);
		} finally {
			session.close();
		}
		return checkedOutBookList;
	}

}
