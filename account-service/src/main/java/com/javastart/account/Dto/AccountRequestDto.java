package com.javastart.account.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class AccountRequestDto {
    private Long accountId;
    private String email;
    private String name;
    private String phone;
    private List<Long> bills;

    private OffsetDateTime creationDate;

}
