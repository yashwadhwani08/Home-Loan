package com.barclays.homeLoanApplication.serviceImpl;

import com.barclays.homeLoanApplication.entity.SavingAccount;
import com.barclays.homeLoanApplication.repository.SavingAccountRepository;
import com.barclays.homeLoanApplication.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {
    @Autowired
    private SavingAccountRepository savingAccountRepository;

    @Override
    public SavingAccount saveSavingAccount(SavingAccount savingAccount) {
        return savingAccountRepository.save(savingAccount);
    }

    @Override
    public List<SavingAccount> getAllSavingAccount() {
        return savingAccountRepository.findAll();
    }
}
