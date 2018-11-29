package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;

import com.domain.Book;
import com.domain.BookLoan;
import com.service.BookLoanService;
import com.service.BookService;

@Controller
public class CheckInBookController {

	@RequestMapping(value = "/checkinbook/{primarykeystring}", method = RequestMethod.GET)
	public String bookCheckInForm(@PathVariable String primarykeystring, Model model) {
		String[] primaryKeys = primarykeystring.split("@");
		System.out.println(Arrays.toString(primaryKeys));
		BookLoan bkLoan = new BookLoan();
		BookService myBookService = new BookService();
		Book book = myBookService.getBookFromBookId(new BigDecimal(primaryKeys[0]));
		bkLoan.setBookid(new BigDecimal(primaryKeys[0]));
		bkLoan.setBranchid(new BigDecimal(primaryKeys[1]));
		bkLoan.setCardno(primaryKeys[2]);
		model.addAttribute("bkloan", bkLoan);
		model.addAttribute("book", book);
		return "checkinbook";
	}
	
	@RequestMapping(value = "/checkinbook", method = RequestMethod.POST)
	public String bookCheckInResult(@ModelAttribute BookLoan bkloan, @ModelAttribute Book book, Model model) {
		BookLoanService myBookService = new BookLoanService();
		bkloan.setDatein(new Date());
		myBookService.turnInAndRateBook(bkloan);
		model.addAttribute("cardno", bkloan.getCardno());
		return "bookcheckinsuccess";
	}
}
