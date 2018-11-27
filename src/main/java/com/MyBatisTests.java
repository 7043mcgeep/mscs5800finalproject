package com;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.domain.BookLoan;
import com.domain.BookView;
import com.domain.Borrower;
import com.domain.CheckedOutBook;
import com.service.BookLoanService;
import com.service.BookViewService;
import com.service.BorrowerService;
import com.service.CheckedOutBooksService;

public class MyBatisTests {

	public static void main(String[] args) {
		testGetBorrowerWithCardNo();
		testInsertBorrower();
		testDeleteBorrower();
		testInsertLoan();
		testDeleteLoan();
		testGetAvailableBooks();
		testGetCheckedOutBooksByUser("1");
	}

	private static void testDeleteBorrower() {
		BorrowerService borrService = new BorrowerService();
		borrService.deleteBorrowerWithCardNo("12345");
		
	}

	public static void testGetBorrowerWithCardNo() {
		BorrowerService borrService = new BorrowerService();
		Borrower borr1 = borrService.getBorrowerWithCardNo("1");
		System.out.println(borr1);
	}
	
	public static void testInsertBorrower() {
		BorrowerService borrService = new BorrowerService();
		Borrower borr1 = new Borrower("12345", "Chris", "123 Easy Street", "414-555-5555", "12345");
		borrService.insertBorrower(borr1);
	}
	
	public static void testInsertLoan() {
		BookLoanService blService = new BookLoanService();
		GregorianCalendar dateout = new GregorianCalendar();
		GregorianCalendar duedate = new GregorianCalendar();
		duedate.set(Calendar.MONTH, (duedate.get(Calendar.MONTH) + 1) % 12);
		BookLoan bkLoan = new BookLoan(new BigDecimal(1111), new BigDecimal(6380), "1", dateout.getTime(), duedate.getTime(), null, new BigDecimal(1.0));
		blService.insertBookLoan(bkLoan);
	}
	
	public static void testDeleteLoan() {
		BookLoanService blService = new BookLoanService();
		blService.deleteBookLoan(new BigDecimal(1111), new BigDecimal(6380), "1");
	}
	
	public static void testGetAvailableBooks() {
		BookViewService bookViewService = new BookViewService();
		for (BookView bk : bookViewService.getAvailableBooks("1"))
			System.out.println(bk);
	}

	public static void testGetCheckedOutBooksByUser(String cardno) {
		CheckedOutBooksService checkedOutBookService = new CheckedOutBooksService();
		for (CheckedOutBook bk : checkedOutBookService.getCheckedOutBooks(cardno))
			System.out.println(bk);
	}
}


