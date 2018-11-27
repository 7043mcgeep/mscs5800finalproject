package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.BookView;
import com.service.BookViewService;
import com.service.BorrowerService;

@Controller
public class CheckoutMoreBooksController {
	
	@RequestMapping(value = "/checkoutmorebooks/{cardno}", method = RequestMethod.GET)
	public String checkoutForm(@PathVariable String cardno, Model model) {
		BookViewService myBookViewService = new BookViewService();
		BorrowerService myBorrowerService = new BorrowerService();
		List<BookView> availableBooks = myBookViewService.getAvailableBooks(cardno);
		model.addAttribute("availablebooks", availableBooks);
		model.addAttribute("borrower", myBorrowerService.getBorrowerWithCardNo(cardno));
		return "checkoutmorebooks";
	}
}
