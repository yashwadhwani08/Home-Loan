package com.barclays.homeLoanApplication.serviceImpl;

import java.text.DecimalFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.barclays.homeLoanApplication.entity.LoanRepaymentSchedule;
import com.barclays.homeLoanApplication.params.LoanParams;
import com.barclays.homeLoanApplication.repository.LoanRepaymentScheduleRepository;
import com.barclays.homeLoanApplication.service.LoanRepaymentScheduleService;

@Service
public class LoanRepaymentScheduleServiceImpl implements LoanRepaymentScheduleService {
	
	@Autowired 
	LoanRepaymentScheduleRepository repo;
	
	@Override
	public List<LoanRepaymentSchedule> addSchedule(LoanParams lp) {
		int loanid = lp.getLoanid();
		double amount = lp.getAmount();
		int month = lp.getMonth();
		double rate = lp.getRate();
		double mRate = rate/12/100;		//monthly rate
		double term = Math.pow((1+mRate), month);
		double emi = (amount * mRate * term) / (term - 1);
		DecimalFormat df = new DecimalFormat("#.00");
		emi = Double.parseDouble(df.format(emi));
		List<LoanRepaymentSchedule> plist = new ArrayList<>();

		//first month
		LoanRepaymentSchedule obj = new LoanRepaymentSchedule();
		obj.setLoanid(loanid);
		YearMonth k = YearMonth.now().plusMonths(1);
		obj.setDate(k.format(DateTimeFormatter.ofPattern("MMM yyyy")));
//		obj.setDate("1");
		obj.setEmi(emi);
		obj.setInterest(Double.parseDouble(df.format(amount * mRate)));
		obj.setPrincipal(Double.parseDouble(df.format(emi - obj.getInterest())));
		double prevOut = Double.parseDouble(df.format(amount - obj.getPrincipal()));
		obj.setOutstanding(Double.parseDouble(df.format(prevOut)));
		obj.setPaid("Pending");
		plist.add(obj);

		//after the first month
		for(int i=1; i<month; i++) {
			LoanRepaymentSchedule obj1 = new LoanRepaymentSchedule();
			YearMonth k1 = YearMonth.now().plusMonths(i+1);
			obj1.setLoanid(loanid);
			obj1.setDate(k1.format(DateTimeFormatter.ofPattern("MMM yyyy")));
			obj1.setEmi(emi);
			obj1.setInterest(Double.parseDouble(df.format(prevOut * mRate)));
			obj1.setPrincipal(Double.parseDouble(df.format(emi - obj1.getInterest())));
			obj1.setOutstanding(Double.parseDouble(df.format(prevOut - obj1.getPrincipal())));
			prevOut = obj1.getOutstanding();
			obj1.setPaid("Pending");
			plist.add(obj1);
		}

		return repo.saveAll(plist);
	}
	
	@Override
	public List <LoanRepaymentSchedule> getSchedule(int loanid) {
		return repo.findByLoanId(loanid);
	}
	
	@Override
	public LoanRepaymentSchedule updateLoanSchedule(int loanid) {
		List <LoanRepaymentSchedule> temp = repo.findByLoanId(loanid);
		int res = 0;
		for(int i=0; i<temp.size(); i++) {
			if(temp.get(0).getPaid().equals("Pending")) {
				res = temp.get(0).getpaymentid();
				repo.updateByPaymentId("Paid", res);
				return temp.get(0);
			}
			else {
				if(temp.get(i).getPaid().equals("Paid")) {
					continue;
				}
				else {
					res = temp.get(i).getpaymentid();
					repo.updateByPaymentId("Paid", res);
					return temp.get(i);
				}
			}
		}
		return null;
	}
}
