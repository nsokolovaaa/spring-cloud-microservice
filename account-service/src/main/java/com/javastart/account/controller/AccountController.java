package com.javastart.account.controller;

import com.javastart.account.Dto.AccountRequestDto;
import com.javastart.account.Dto.AccountResponseDto;
import com.javastart.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController  {
    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{accountId}")
    public AccountResponseDto getAccount(@PathVariable Long accountId) {
        return new AccountResponseDto(accountService.getAccountId(accountId));

    }
    @PostMapping("/")
    public Long createAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return accountService.createAccount(accountRequestDto.getEmail(),
                accountRequestDto.getName(), accountRequestDto.getPhone(), accountRequestDto.getBills());
    }
    @PutMapping("/{accountId}")
    public AccountResponseDto updateAccount(@PathVariable Long accountId, @RequestBody AccountRequestDto accountRequestDto) {
        return new AccountResponseDto(accountService.updateAccount(accountId, accountRequestDto.getEmail(),
                accountRequestDto.getName(), accountRequestDto.getPhone(), accountRequestDto.getBills()));

    }
    @DeleteMapping("/{accountId}")
    public AccountResponseDto deleteAccount(@PathVariable Long accountId) {
        return new AccountResponseDto(accountService.deleteAccount(accountId));
    }
}
