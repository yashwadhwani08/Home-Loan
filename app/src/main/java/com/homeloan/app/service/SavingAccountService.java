package com.homeloan.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.app.entity.SavingAccount;
import com.homeloan.app.repository.SavingAccountRepository;

@Service
public class SavingAccountService {

	@Autowired
	private SavingAccountRepository savingAccountRepository;
	
	public SavingAccount saveAcc(SavingAccount savingAccount)
	{
		return savingAccountRepository.save(savingAccount);
	}
	
	public List<SavingAccount> getAllAcc()
	{
		return savingAccountRepository.findAll();
	}
}
