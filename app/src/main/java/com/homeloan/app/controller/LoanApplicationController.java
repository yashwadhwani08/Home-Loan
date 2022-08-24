package com.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.app.entity.LoanApplication;
import com.homeloan.app.service.LoanApplicationService;

@RestController
public class LoanApplicationController {
	@Autowired
	private LoanApplicationService loanApplicationService;
	
	@PostMapping("/loan-application")
	public String saveLoanApp(@RequestBody LoanApplication loanApplication)
	{
		return loanApplicationService.loanApplicationSave(loanApplication);
	}
		
	
}
