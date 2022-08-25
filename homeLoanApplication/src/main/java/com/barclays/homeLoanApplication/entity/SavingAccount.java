package com.barclays.homeLoanApplication.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "SavingAccount")
public class SavingAccount implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sequenceId;

    @Column
    private long savingAccountNumber;

    @Column
    private String applicantEmail;

    @Column
    private double accountBalance;

    public SavingAccount() {
    }

    

    public String getApplicantEmail() {
		return applicantEmail;
	}



	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}



	public void setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
	}



	public void setSavingAccountNumber(long savingAccountNumber) {
		this.savingAccountNumber = savingAccountNumber;
	}



	



	public SavingAccount(long sequenceId, long savingAccountNumber, String applicantEmail, double accountBalance) {
		super();
		this.sequenceId = sequenceId;
		this.savingAccountNumber = savingAccountNumber;
		this.applicantEmail = applicantEmail;
		this.accountBalance = accountBalance;
	}



	public long getSavingAccountNumber() {
        return savingAccountNumber;
    }

    public long getSequenceId() {
        return sequenceId;
    }
   

    public User getApplicantEMail() {
        return applicantEmail;
    }

    public void setApplicantEMail(User applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "savingAccountNumber=" + savingAccountNumber +
                ", sequenceId='" + sequenceId + '\'' +
                ", applicantEmail='" + applicantEmail + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SavingAccount that = (SavingAccount) o;

        return getSavingAccountNumber() == that.getSavingAccountNumber();
    }

    @Override
    public int hashCode() {
        return (int) (getSavingAccountNumber() ^ (getSavingAccountNumber() >>> 32));
    }
}
