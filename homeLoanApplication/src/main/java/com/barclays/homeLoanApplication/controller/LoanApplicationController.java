package com.barclays.homeLoanApplication.controller;

import com.barclays.homeLoanApplication.entity.LoanApplication;
import com.barclays.homeLoanApplication.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApplicationController {
    @Autowired
    private LoanApplicationService loanApplicationService;

    @PostMapping("/loan-application")
    public String saveLoanApp(@RequestBody LoanApplication loanApplication) {
        return loanApplicationService.saveLoanApplication(loanApplication);
    }
}
