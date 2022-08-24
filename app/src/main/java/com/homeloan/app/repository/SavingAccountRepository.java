package com.homeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.app.entity.SavingAccount;

@Repository
public interface SavingAccountRepository extends JpaRepository<SavingAccount, Long>{

}
