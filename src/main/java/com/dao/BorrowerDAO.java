package com.dao;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.domain.Borrower;
import com.util.ConnectionFactory;

public class BorrowerDAO {

	public List<Borrower> getBorrowerWithCardNo(String cardno) {
		List<Borrower> borrowerList = new ArrayList<Borrower>();
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			borrowerList = session.selectList("com.mapper.LibraryMapper.selectBorrowerByCardID", cardno);
		} finally {
			session.close();
		}
		return borrowerList;
	}
	
	public void insertBorrower(Borrower borr) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			session.insert("com.mapper.LibraryMapper.insertBorrower", borr); 
			session.commit();
		} finally {
			session.close();
		}
	}

	public void deleteBorrowerWithCardNo(String cardno) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			session.delete("com.mapper.LibraryMapper.deleteBorrowerWithCardNo", cardno); 
			session.commit();
		} finally {
			session.close();
		}
		
	}
	


}
