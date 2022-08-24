package com.barclays.homeLoanApplication.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "LoanApplication")
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanApplicationId;

    @Column
    private String homeAddress;

    @Column
    private double loanAmount;

    @Column
    private long loanTenure;

    @Column
    private long applicantMonthlySalary;

    @Column
    private String applicantEmail;

    @Column
    private String loanStatus;

    public LoanApplication() {
    	super();
    }
    
    @Column
	private int month;
    
    public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
    
    @Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date timestamp;

	@PrePersist
	private void onCreate() {
	    timestamp = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(timestamp);
	    int month = calendar.get(Calendar.MONTH);
	    month++;
	    System.out.println(month);
	    setMonth(month);
	   }


    

    public LoanApplication(long loanApplicationId, String homeAddress, double loanAmount, long loanTenure,
			long applicantMonthlySalary, String applicantEmail, String loanStatus, int month, Date timestamp) {
		super();
		this.loanApplicationId = loanApplicationId;
		this.homeAddress = homeAddress;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.applicantMonthlySalary = applicantMonthlySalary;
		this.applicantEmail = applicantEmail;
		this.loanStatus = loanStatus;
		this.month = month;
		this.timestamp = timestamp;
	}

	public long getLoanApplicationId() {
        return loanApplicationId;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public long getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(long loanTenure) {
        this.loanTenure = loanTenure;
    }

    public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setLoanApplicationId(long loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public long getApplicantMonthlySalary() {
        return applicantMonthlySalary;
    }

    public void setApplicantMonthlySalary(long applicantMonthlySalary) {
        this.applicantMonthlySalary = applicantMonthlySalary;
    }

    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "loanApplicationId=" + loanApplicationId +
                ", homeAddress='" + homeAddress + '\'' +
                ", loanAmount=" + loanAmount +
                ", loanTenure=" + loanTenure +
                ", applicantMonthlySalary=" + applicantMonthlySalary +
                ", applicantEmail='" + applicantEmail + '\'' +
                ", loanStatus='" + loanStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanApplication that = (LoanApplication) o;

        return loanApplicationId == that.loanApplicationId;
    }

    @Override
    public int hashCode() {
        return (int) (loanApplicationId ^ (loanApplicationId >>> 32));
    }
}
