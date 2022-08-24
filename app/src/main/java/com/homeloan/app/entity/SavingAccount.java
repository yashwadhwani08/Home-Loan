package com.homeloan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SavingAccount")
public class SavingAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long sequenceId;
	
	@Column(unique = true)
	private long accountNumber;
	
	@Column
	private String email;
	
	@Column
	private float balance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	

	public SavingAccount(long sequenceId, long accountNumber, String email, float balance) {
		super();
		this.sequenceId = sequenceId;
		this.accountNumber = accountNumber;
		this.email = email;
		this.balance = balance;
	}

	public long getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
	}

	public SavingAccount() {
		super();
	}

}
