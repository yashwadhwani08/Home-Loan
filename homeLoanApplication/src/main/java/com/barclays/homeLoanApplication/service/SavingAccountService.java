package com.barclays.homeLoanApplication.service;

import com.barclays.homeLoanApplication.entity.SavingAccount;

import java.util.List;

public interface SavingAccountService {
    SavingAccount saveSavingAccount(SavingAccount savingAccount);
    List<SavingAccount> getAllSavingAccount();
}
