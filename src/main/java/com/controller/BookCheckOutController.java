package com.controller;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.BookLoan;
import com.service.BookLoanService;


@Controller
public class BookCheckOutController {

	@RequestMapping(value = "/bookcheckout/{primarykeystring}", method = RequestMethod.GET)
	public String checkoutResult(@PathVariable String primarykeystring, Model model) {
		String[] primaryKeys = primarykeystring.split("@");
		if (primaryKeys.length == 3 ) {
			String bookid = primaryKeys[0];
			String branchid = primaryKeys[1];
			String cardno = primaryKeys[2];
			GregorianCalendar dateout = new GregorianCalendar();
			GregorianCalendar duedate = new GregorianCalendar();
			duedate.set(Calendar.MONTH, (duedate.get(Calendar.MONTH) + 1) % 12);
			BookLoan bkloan = new BookLoan(new BigDecimal(bookid), new BigDecimal(branchid), cardno, dateout.getTime(), duedate.getTime(), null, null);
			BookLoanService myBookLoanService = new BookLoanService();
			myBookLoanService.insertBookLoan(bkloan);
			model.addAttribute("cardno", cardno);
		}
		return "bookcheckoutsuccess";
	}
	
}
