package com.homeloan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoanApplication")
public class LoanApplication {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String address;
	
	@Column
	private long loanAmt;
	
	@Column
	private long tenure;
	
	@Column
	private long monthlySalary;
	
	@Column
	private String email;
	
	@Column
	private String status;

	public LoanApplication(long id, String address, long loanAmt, long tenure, long monthlySalary, String email,
			String status) {
		super();
		this.id = id;
		this.address = address;
		this.loanAmt = loanAmt;
		this.tenure = tenure;
		this.monthlySalary = monthlySalary;
		this.email = email;
		this.status = status;
	}

	public LoanApplication() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(long loanAmt) {
		this.loanAmt = loanAmt;
	}

	public long getTenure() {
		return tenure;
	}

	public void setTenure(long tenure) {
		this.tenure = tenure;
	}

	public long getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(long monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
