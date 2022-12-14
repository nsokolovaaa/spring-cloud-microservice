package com.javastart.deposit.Dto;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
public class DepositRequestDto {

    private Long accountId;

    private Long billId;

    private BigDecimal amount;
}
