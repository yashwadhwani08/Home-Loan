package com.barclays.homeLoanApplication.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.barclays.homeLoanApplication.entity.LoanRepaymentSchedule;
import com.barclays.homeLoanApplication.params.LoanParams;

public interface LoanRepaymentScheduleService {
	public List<LoanRepaymentSchedule> addSchedule(@RequestBody LoanParams lp);
	public List <LoanRepaymentSchedule> getSchedule(int loanid);
	public LoanRepaymentSchedule updateLoanSchedule(int loanid);
		
	
}
