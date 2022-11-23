package com.javastart.account.service;

import com.javastart.account.Entity.Account;
import com.javastart.account.Repository.AccountRepository;
import com.javastart.account.exception.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccountId(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new AccountException("Don't found account with" + accountId));

    }

    public Long createAccount(String email, String name, String phone, List<Long> bills) {
        Account account = new Account(email, name, phone, OffsetDateTime.now(), bills);
        return accountRepository.save(account).getAccountId();
    }

    public Account updateAccount(Long accountId, String email, String name, String phone, List<Long> bills) {
        Account account = new Account();
        account.setName(name);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBills(bills);
        return accountRepository.save(account);
    }

    public Account deleteAccount(Long accountId) {
        Account accountDelete = getAccountId(accountId);
        accountRepository.deleteById(accountId);
        return accountDelete;
    }
}
