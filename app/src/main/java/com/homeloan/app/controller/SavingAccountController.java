package com.homeloan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.app.entity.SavingAccount;
import com.homeloan.app.service.SavingAccountService;

@RestController
public class SavingAccountController {
	@Autowired
	private SavingAccountService savingAccountService;
	
	@GetMapping("/saving-accounts")
	public ResponseEntity<List<SavingAccount>> getAllAcc()
	{
		List<SavingAccount> list = savingAccountService.getAllAcc();
		return new ResponseEntity<List<SavingAccount>> (list, HttpStatus.OK);
	}
	
	@PostMapping("/saving-accounts")
	public ResponseEntity<SavingAccount> savAcc(@RequestBody SavingAccount savingAccount)
	{
		SavingAccount savingAccount2 = savingAccountService.saveAcc(savingAccount);
		return new ResponseEntity<SavingAccount> (savingAccount2, HttpStatus.CREATED);
	}		
	
}
