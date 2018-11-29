package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.domain.BookLoan;
import com.util.ConnectionFactory;

public class BookLoanDAO {

	public void insertBookLoan(BookLoan bkLoan) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			session.insert("com.mapper.LibraryMapper.insertBookLoan", bkLoan); 
			session.commit();
		} finally {
			session.close();
		}
	}

	public void deleteBookLoan(BookLoan bkLoan) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			session.delete("com.mapper.LibraryMapper.deleteBookLoan", bkLoan); 
			session.commit();
		} finally {
			session.close();
		}
	}

	public void turnInAndRateBook(BookLoan bkloan) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			session.update("com.mapper.LibraryMapper.turnInAndRateBook", bkloan); 
			session.commit();
		} finally {
			session.close();
		}
		// TODO Auto-generated method stub
		
	}
	
}
