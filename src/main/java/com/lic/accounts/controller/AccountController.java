package com.lic.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("account")
	public String createAccount() {
		return "Account Message";
	}

}
