package com.barclays.homeLoanApplication.controller;

import com.barclays.homeLoanApplication.entity.SavingAccount;
import com.barclays.homeLoanApplication.service.SavingAccountService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SavingAccountController {
    @Autowired
    private SavingAccountService savingAccountService;

    @GetMapping("/saving-accounts")
    public ResponseEntity<List<SavingAccount>> getAllAccount() {
        List<SavingAccount> accountList = savingAccountService.getAllSavingAccount();
        return new ResponseEntity<List<SavingAccount>>(accountList, HttpStatus.OK);
    }

    @PostMapping("/saving-accounts")
    public ResponseEntity<SavingAccount> saveAccount(@RequestBody SavingAccount savingAccount) {
        SavingAccount savingAccount1 = savingAccountService.saveSavingAccount(savingAccount);
        return new ResponseEntity<SavingAccount> (savingAccount1, HttpStatus.CREATED);
    }
}
