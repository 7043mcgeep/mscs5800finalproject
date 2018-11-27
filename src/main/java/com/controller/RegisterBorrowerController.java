package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.Borrower;
import com.service.BorrowerService;

@Controller
public class RegisterBorrowerController {

	@GetMapping("/register_borrower")
	public String newBorrowerForm(Model model) {
		model.addAttribute("register_borrower", new Borrower());
		return "register_borrower";
	}
	
	@PostMapping("/register_borrower")
	public String newBorrowerSubmit(@ModelAttribute Borrower borr) {
		String cardno = borr.getCardno();
		BorrowerService borrService = new BorrowerService();
		if (cardno.length() == 0) {
			return "register_borrower_nocardid_failure";
		} else if (borrService.getBorrowerWithCardNo(cardno) != null){
			return "register_borrower_nonunique_failure";
		} else {
			borrService.insertBorrower(borr);
			return "register_borrower_success";
		}
	}
	
	@ModelAttribute("borrower")
	public Borrower getBorrowerObject() {
		return new Borrower();
	}
	
}
