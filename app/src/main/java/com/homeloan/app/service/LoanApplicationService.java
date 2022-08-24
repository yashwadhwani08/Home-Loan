package com.homeloan.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.app.constants.SystemConstants;
import com.homeloan.app.entity.LoanApplication;
import com.homeloan.app.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	@Autowired
	private LoanApplicationRepository loanAppRepository;
	
	public String loanApplicationSave(LoanApplication loanApp)
	{
		int maxEligibeLoanAmount = (int) (loanApp.getMonthlySalary()*50);
		
		
		if(loanApp.getTenure() < SystemConstants.MINIMUM_LOAN_TENURE || loanApp.getTenure() > SystemConstants.MAXIMUM_LOAN_TENURE)
		{
			loanApp.setStatus("Cancelled");
			loanAppRepository.save(loanApp);			
			return "Your tenure should be between "+ SystemConstants.MINIMUM_LOAN_TENURE+ " and " + SystemConstants.MAXIMUM_LOAN_TENURE;
		}
		
		if(loanApp.getLoanAmt() <= maxEligibeLoanAmount)
		{
			loanApp.setStatus("Approved");
			loanAppRepository.save(loanApp);
			float EMI = (float) ((loanApp.getLoanAmt() * 0.12/12 * Math.pow((1 + 0.12/12),loanApp.getTenure()*12)) /(Math.pow((1 + 0.12/12),(loanApp.getTenure()*12))-1));
			return "Your loan has been sanctioned "+"EMI = "+EMI;
		}
		
		loanApp.setStatus("Cancelled");
		loanAppRepository.save(loanApp);
		return "Your requested Loan Amount can't be sactioned. However you are eligible to get a loan of maximum Rs."+ maxEligibeLoanAmount;
		
		
	}
	
	public List<LoanApplication> getAllApplications()
	{
		return loanAppRepository.findAll();
		
	}
}
