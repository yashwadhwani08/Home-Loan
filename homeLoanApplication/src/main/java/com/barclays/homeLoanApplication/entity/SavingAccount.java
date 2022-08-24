package com.barclays.homeLoanApplication.entity;

import javax.persistence.*;

@Entity
@Table(name = "SavingAccount")
public class SavingAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long savingAccountNumber;

    @Column()
    private String sequenceId;

    @Column
    private String applicantEMail;

    @Column
    private double accountBalance;

    public SavingAccount() {
    }

    public SavingAccount(String sequenceId, String applicantEMail, double accountBalance) {
        this.sequenceId = sequenceId;
        this.applicantEMail = applicantEMail;
        this.accountBalance = accountBalance;
    }

    public long getSavingAccountNumber() {
        return savingAccountNumber;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getApplicantEMail() {
        return applicantEMail;
    }

    public void setApplicantEMail(String applicantEMail) {
        this.applicantEMail = applicantEMail;
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
                ", applicantEMail='" + applicantEMail + '\'' +
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
