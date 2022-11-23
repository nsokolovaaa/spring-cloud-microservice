package com.javastart.account.Dto;

import com.javastart.account.Entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.ElementCollection;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class AccountResponseDto {

    private Long accountId;
    private String email;
    private String name;
    private String phone;
    private List<Long> bills;
    private OffsetDateTime  creationDate;

    public AccountResponseDto(Account account) {
            accountId = account.getAccountId();
            name = account.getName();
            email = account.getEmail();
            phone = account.getPhone();
            bills = account.getBills();
            creationDate = account.getCreationDate();
    }
}
