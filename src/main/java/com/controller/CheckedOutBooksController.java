package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.CheckedOutBook;
import com.service.BorrowerService;
import com.service.CheckedOutBooksService;

@Controller
public class CheckedOutBooksController {

	@RequestMapping(value = "/checkedoutbooks/{cardno}", method = RequestMethod.GET)
	public String checkedoutForm(@PathVariable String cardno, Model model) {
		CheckedOutBooksService myCheckedOutBookService = new CheckedOutBooksService();
		BorrowerService myBorrowerService = new BorrowerService();
		List<CheckedOutBook> checkedOutBooks = myCheckedOutBookService.getCheckedOutBooks(cardno);
		model.addAttribute("ownedbooks", checkedOutBooks);
		model.addAttribute("borrower", myBorrowerService.getBorrowerWithCardNo(cardno));
		return "checkedoutbooks";
	}
}
