package com.barclays.homeLoanApplication.params;

import com.barclays.homeLoanApplication.constants.LoanApplicationConstants;

public class LoanParams {
	int loanid;
	double amount;
	int month;
	
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getRate() {
		return LoanApplicationConstants.RATE_OF_INTEREST;
	}
	public LoanParams(int loanid, double amount, int month, double rate) {
		super();
		this.loanid = loanid;
		this.amount = amount;
		this.month = month;
	}
	public LoanParams() {
		super();
	}	
}
