package com.barclays.homeLoanApplication.params;

public class LoanParams {
	int loanid;
	double amount;
	int month;
	double rate;
	
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
		return rate;
	}
	public LoanParams(int loanid, double amount, int month, double rate) {
		super();
		this.loanid = loanid;
		this.amount = amount;
		this.month = month;
		this.rate = rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public LoanParams() {
		super();
	}	
}
