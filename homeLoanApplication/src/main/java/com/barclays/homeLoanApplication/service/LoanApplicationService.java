package com.barclays.homeLoanApplication.service;


import com.barclays.homeLoanApplication.entity.LoanApplication;

import java.util.List;

public interface LoanApplicationService {
    String saveLoanApplication(LoanApplication loanApplication);
    List<LoanApplication> getAllLoanApplications();
}
