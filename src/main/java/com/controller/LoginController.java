package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.Borrower;
import com.service.BorrowerService;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("login", new Borrower());
		return "login";
	}
	
	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute Borrower borr) {
		String cardno = borr.getCardno();
		BorrowerService borrService = new BorrowerService();
		Borrower borr2 = borrService.getBorrowerWithCardNo(cardno);
		if (borr2 != null) {
			if (!borr2.getPassword().equals(borr.getPassword())) {
				return "passworderror";
			} else {
				borr.setAddress(borr2.getAddress());
				borr.setPhone(borr2.getPhone());
				borr.setPassword(borr2.getPassword());
				borr.setName(borr2.getName());
				return "checkout";
			}
		} else {
			return "loginerror";
		}
	}
	
	@ModelAttribute("borrower")
	public Borrower getBorrowerObject() {
		return new Borrower();
	}
}
