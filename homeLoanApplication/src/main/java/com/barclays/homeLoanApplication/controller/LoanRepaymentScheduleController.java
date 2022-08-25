package com.barclays.homeLoanApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.homeLoanApplication.entity.LoanRepaymentSchedule;
import com.barclays.homeLoanApplication.params.LoanParams;
import com.barclays.homeLoanApplication.serviceImpl.LoanRepaymentScheduleServiceImpl;

@RestController
public class LoanRepaymentScheduleController {
	@Autowired
	private LoanRepaymentScheduleServiceImpl lrs;

	@PostMapping("/add-loan-schedule")	
	public List<LoanRepaymentSchedule> addSchedule(@RequestBody LoanParams lp) {
		return lrs.addSchedule(lp);
	}

	@GetMapping("/get-loan-schedule/{loanid}")
	public List <LoanRepaymentSchedule> getSchedule(@PathVariable("loanid") int loanid) {
		return lrs.getSchedule(loanid);
	}

	@PutMapping("update-loan-schedule/{loanid}")
	public LoanRepaymentSchedule updateLoanSchedule(@PathVariable("loanid") int loanid) {
		return lrs.updateLoanSchedule(loanid);
	}
}
