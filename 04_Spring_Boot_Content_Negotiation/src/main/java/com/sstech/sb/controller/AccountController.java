package com.sstech.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sstech.sb.model.Account;

@RestController
public class AccountController {

	@GetMapping("/account")
	public Account getAccount() {
		
		return buildAccount();
	}
	@PostMapping(value = "/account")
	public String saveAccount(@RequestBody Account account) {
		System.out.println("****Account is :"+account);
		return "Account Saved Successfully";
	}

	private Account buildAccount() {
		Account account = new Account();
		account.setAccId(123456);
		account.setName("Ramesh");
		account.setBalance(985636);
		account.setBranchName("Ekkatuthangal");
		account.setCity("Chennai Central");
		return account;
	}
}
